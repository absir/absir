/**
 * Copyright 2014 ABSir's Studio
 * <p/>
 * All right reserved
 * <p/>
 * Create on 2014-1-6 下午5:30:37
 */
package com.absir.property;

public interface PropertyObject<T> {

    public T getPropertyData(String name, Property property);
}
