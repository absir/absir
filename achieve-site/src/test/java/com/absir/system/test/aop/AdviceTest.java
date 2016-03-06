/**
 * Copyright 2014 ABSir's Studio
 * 
 * All right reserved
 *
 * Create on 2014年9月11日 上午10:12:34
 */
package com.absir.system.test.aop;

import java.lang.reflect.Method;

import org.junit.Test;

import com.absir.aserv.advice.MethodAfter;
import com.absir.aserv.system.crud.UploadCrudFactory;
import com.absir.bean.core.BeanFactoryUtils;
import com.absir.bean.inject.value.Bean;
import com.absir.system.test.AbstractTestInject;

/**
 * @author absir
 *
 */
public class AdviceTest extends AbstractTestInject {

	@Bean
	public static class AdviceBean {

		public static final AdviceBean ME = BeanFactoryUtils.get(AdviceBean.class);

		public void peek(String name) {
			System.out.println("peek:" + name);
		}

	}

	@Bean
	public static class TestAdvice extends MethodAfter {
		/*
		 * (non-Javadoc)
		 * 
		 * @see com.absir.aserv.advice.IMethodAdvice#matching(java.lang.Class,
		 * java.lang.reflect.Method)
		 */
		@Override
		public boolean matching(Class<?> beanType, Method method) {
			return AdviceBean.class.isAssignableFrom(beanType) || UploadCrudFactory.class.isAssignableFrom(beanType);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.absir.aserv.advice.MethodAfter#advice(java.lang.Object,
		 * java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
		 */
		@Override
		public void advice(Object proxy, Object returnValue, Method method, Object[] args) {
			System.out.println("after:" + proxy + returnValue + method);
		}
	}

	@Test
	public void test() throws Throwable {
		AdviceBean.ME.peek("TTT");
	}
	
	public static void main(String...args) throws Throwable {
		new AdviceTest().test();
	}

}
