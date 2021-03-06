/**
 * Copyright 2013 ABSir's Studio
 * <p/>
 * All right reserved
 * <p/>
 * Create on 2013-11-20 下午2:38:37
 */
package com.absir.aserv.system.bean.base;

import com.absir.aserv.system.bean.JEmbedLI;
import com.absir.aserv.system.bean.value.JaLang;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class JbBeanLI extends JbBase {

    @JaLang("编号")
    @Id
    private JEmbedLI id;

    public JEmbedLI getId() {
        return id;
    }

    public void setId(JEmbedLI id) {
        this.id = id;
    }
}
