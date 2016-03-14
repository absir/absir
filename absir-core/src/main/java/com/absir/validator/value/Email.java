/**
 * Copyright 2014 ABSir's Studio
 * <p>
 * All right reserved
 * <p>
 * Create on 2014-1-2 下午7:34:01
 */
package com.absir.validator.value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author absir
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {

}
