/**
 * Copyright 2014 ABSir's Studio
 * <p/>
 * All right reserved
 * <p/>
 * Create on 2014-1-21 上午11:01:06
 */
package com.absir.orm.transaction.value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author absir
 *
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Transaction {

    /**
     * @return
     */
    String name() default "";

    /**
     * @return
     */
    boolean readOnly() default false;

    /**
     * @return
     */
    Class<?>[] rollback() default {};

    /**
     * @return
     */
    boolean nested() default false;

    /**
     * @return
     */
    boolean required() default false;

    /**
     * @return
     */
    int timeout() default -1;
}
