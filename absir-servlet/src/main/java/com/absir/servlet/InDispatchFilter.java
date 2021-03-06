/**
 * Copyright 2014 ABSir's Studio
 * <p/>
 * All right reserved
 * <p/>
 * Create on 2014-1-8 下午4:47:28
 */
package com.absir.servlet;

import com.absir.bean.basis.BeanFactory;
import com.absir.bean.basis.Configure;
import com.absir.bean.core.BeanFactoryUtils;
import com.absir.bean.inject.value.Inject;
import com.absir.bean.inject.value.Orders;
import com.absir.context.core.ContextDaemon;
import com.absir.context.core.ContextUtils;
import com.absir.core.helper.HelperIO;
import com.absir.core.kernel.KernelCharset;
import com.absir.core.kernel.KernelClass;
import com.absir.core.kernel.KernelDyna;
import com.absir.core.kernel.KernelReflect;
import com.absir.server.in.InDispatcher;
import com.absir.server.in.InMethod;
import com.absir.server.in.InModel;
import com.absir.server.in.Input;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.Introspector;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URLDecoder;

@Configure
public class InDispatchFilter extends InDispatcher<HttpServletRequest, HttpServletResponse> implements Filter {

    public static final String REQUEST_INPUT = InDispatchFilter.class.getName() + "@REQUEST_INPUT";

    private static ServletContext servletContext;

    private static String contextResourcePath;

    private static String contextPath;

    @Orders
    @Inject
    private static IFilter[] filters;

    private int contextPathLength;

    private String uriContextPath;

    private int uriContextPathLength;

    private boolean urlDecode;

    public static ServletContext getServletContext() {
        return servletContext;
    }

    public static String getContextResourcePath() {
        return contextResourcePath;
    }

    public static String getContextPath() {
        return contextPath;
    }

    public static final Input getInput(ServletRequest request) {
        return (Input) request.getAttribute(REQUEST_INPUT);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        servletContext = filterConfig.getServletContext();
        contextResourcePath = servletContext.getRealPath("/");
        contextPath = filterConfig.getInitParameter("contextPath");
        if (contextPath == null) {
            BeanFactory beanFactory = BeanFactoryUtils.get();
            if (beanFactory != null) {
                contextPath = KernelDyna.to(beanFactory.getBeanConfig().getValue("contextPath"), String.class);
            }

            if (contextPath == null) {
                contextPath = filterConfig.getServletContext().getContextPath();
            }
        }

        contextPathLength = contextPath.length();
        uriContextPath = filterConfig.getInitParameter("uri");
        uriContextPathLength = uriContextPath == null ? -1 : (contextPathLength + uriContextPath.length());
        String urlDecoding = filterConfig.getInitParameter("urlDecode");
        if (urlDecoding == null) {
            BeanFactory beanFactory = BeanFactoryUtils.get();
            if (beanFactory != null) {
                urlDecoding = KernelDyna.to(beanFactory.getBeanConfig().getValue("urlDecode"), String.class);
            }
        }

        if (urlDecoding != null) {
            urlDecode = KernelDyna.to(urlDecoding, boolean.class);
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (ContextDaemon.ME.isShutDowning()) {
            response.getWriter().write(ContextDaemon.ME.isShutDowned() ? "shutDowned" : "shutDowning");
            return;
        }

        if (!getRouteAdapter().isStarted()) {
            response.getWriter().write("route adapter not started");
            return;
        }

        if (request instanceof HttpServletRequest && response instanceof HttpServletResponse) {
            try {
                if (on(getUri(request), (HttpServletRequest) request, (HttpServletResponse) response)) {
                    return;
                }

            } catch (Throwable e) {
                throw new ServletException(e);
            }
        }

        chain.doFilter(request, response);
    }

    private String getUri(ServletRequest request) {
        String uri = ((HttpServletRequest) request).getRequestURI();
        int length = uri.length();
        if (length >= contextPathLength) {
            if (length == uriContextPathLength && uri.endsWith(uriContextPath)) {
                String u = request.getParameter("uri");
                return u == null ? "u" : u;
            }

            return length == contextPathLength ? "" : uri.substring(contextPathLength + 1);
        }

        return request.getParameter("uri");
    }

    @Override
    public InMethod getInMethod(HttpServletRequest req) {
        if (req instanceof HttpServletRequest) {
            try {
                return InMethod.valueOf(((HttpServletRequest) req).getMethod().toUpperCase());

            } catch (Exception e) {
            }
        }

        return InMethod.GET;
    }

    @Override
    public String decodeUri(String uri, HttpServletRequest req) {
        if (urlDecode) {
            return uri;
        }

        try {
            String enc = req.getCharacterEncoding();
            if (enc == null) {
                enc = ContextUtils.getCharset().displayName();
            }

            return URLDecoder.decode(uri, enc);

        } catch (Exception e) {
            return uri;
        }
    }

    @Override
    protected Input input(String uri, InMethod inMethod, InModel model, HttpServletRequest req, HttpServletResponse res) {
        Input input = new InputRequest(uri, inMethod, model, req, res);
        req.setAttribute(REQUEST_INPUT, input);
        return input;
    }

    @Override
    public void destroy() {
        for (Field field : KernelReflect.declaredFields(getClass())) {
            int modifiers = field.getModifiers();
            if (KernelClass.isCustomClass(field.getType())) {
                if (Modifier.isFinal(modifiers)) {
                    System.err.println("WebappClassLoader will memory leak at " + field);

                } else {
                    KernelReflect.set(this, field, null);
                }
            }
        }

        Introspector.flushCaches();
    }

    @Override
    public boolean on(String uri, HttpServletRequest req, HttpServletResponse res) throws Throwable {
        if (uri.equals("@shutdown") && req.getLocalAddr().equals("127.0.0.1")) {
            res.getWriter().write("shutdown");
            new Thread() {
                @Override
                public void run() {
                    ContextDaemon.ME.shutdown(false);
                }
            }.start();
            return true;
        }

        if (uri.indexOf('%') >= 0) {
            try {
                uri = URLDecoder.decode(uri, KernelCharset.UTF8.displayName());

            } catch (Throwable e) {
            }
        }

        if (filters != null) {
            for (IFilter filter : filters) {
                if (filter.doFilter(uri, req, res)) {
                    return true;
                }
            }
        }

        if (uri.length() > 7 && uri.startsWith("public/") && uri.indexOf("..") < 0) {
            File file = new File(BeanFactoryUtils.getBeanConfig().getResourcePath() + uri);
            if (file.exists() && file.isFile()) {
                HelperIO.copy(new FileInputStream(file), res.getOutputStream());
                return true;
            }
        }

        return super.on(uri, req, res);
    }
}
