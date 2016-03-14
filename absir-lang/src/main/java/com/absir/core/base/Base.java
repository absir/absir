/**
 * Copyright 2014 ABSir's Studio
 * <p>
 * All right reserved
 * <p>
 * Create on 2014-1-15 下午4:58:40
 */
package com.absir.core.base;

import com.absir.core.kernel.KernelObject;

import java.io.Serializable;

/**
 * @author absir
 */
@SuppressWarnings("rawtypes")
public abstract class Base<ID extends Serializable> implements IBase<ID> {

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return KernelObject.hashCode(getId());
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass() && KernelObject.equals(getId(), ((IBase) obj).getId());
    }
}
