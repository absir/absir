package com.absir.aserv.single;

import com.absir.aserv.advice.AdviceInvoker;
import com.absir.aserv.advice.IMethodAdvice;
import com.absir.aserv.system.bean.JSingle;
import com.absir.aserv.system.dao.BeanDao;
import com.absir.bean.basis.Base;
import com.absir.bean.core.BeanConfigImpl;
import com.absir.bean.inject.value.Bean;
import com.absir.bean.inject.value.Value;
import com.absir.client.helper.HelperJson;
import com.absir.context.core.ContextService;
import com.absir.context.core.ContextUtils;
import com.absir.core.util.UtilLinked;
import com.absir.orm.transaction.value.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import java.lang.reflect.Method;

/**
 * Created by absir on 16/5/30.
 */
@Base
@Bean
public class SingleAdvice extends ContextService implements IMethodAdvice<String> {

    @Value("single.idle.time")
    protected long idleTime = 30000;

    @Value("single.delay.time")
    protected long delayTime = 15000;

    protected UtilLinked<JSingle> runningSingles;

    @Override
    public void step(long contextTime) {
        if (runningSingles != null) {
            runningSingles.syncAdds();

        }
    }

    public String getMethodSingleId(Object proxy, Method method, Object[] args) {
        return method.toString() + "@" + HelperJson.encodeNull(args);
    }

    @Override
    public String matching(Class<?> beanType, Method method) {
        JaSingle single = BeanConfigImpl.getMethodAnnotation(method, JaSingle.class, true);
        return single == null ? null : single.value();
    }

    @Transaction
    @Override
    public Object before(AdviceInvoker invoker, Object proxy, Method method, Object[] args, String advice) throws Throwable {
        String singleId = advice.length() == 0 ? getMethodSingleId(proxy, method, args) : advice;
        Session session = BeanDao.getSession();
        JSingle single = BeanDao.get(session, JSingle.class, singleId);
        if (single != null) {
            if (single.getPassTime() > ContextUtils.getContextTime()) {
                return null;
            }
        }

        if (single != null) {
            long passTime = single.getPassTime();
            try {
                session.lock(single, LockMode.UPGRADE_NOWAIT);
                JSingle newSingle = BeanDao.get(session, JSingle.class, singleId);
                if (newSingle != null && newSingle.getPassTime() == passTime) {

                }

            } catch (HibernateException e) {
                return null;
            }
        }

        if (single == null) {
            single = new JSingle();
            single.setId(singleId);
            single.setPassTime(ContextUtils.getContextTime() + idleTime + delayTime);
            try {
                session.persist(single);
                session.flush();
                try {
                    return invoker.invoke(proxy);

                } finally {
                    session.delete(single);
                }

            } catch (ConstraintViolationException e) {
            }
        }

        return null;
    }

    @Override
    public Object after(Object proxy, Object returnValue, Method method, Object[] args, Throwable e, String advice) throws Throwable {
        return returnValue;
    }

    @Override
    public int getOrder() {
        return -128;
    }
}