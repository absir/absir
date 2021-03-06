/**
 * Copyright 2015 ABSir's Studio
 * <p/>
 * All right reserved
 * <p/>
 * Create on 2015年11月9日 上午9:56:50
 */
package com.absir.master.resolver;

import com.absir.bean.basis.Base;
import com.absir.bean.core.BeanFactoryUtils;
import com.absir.bean.inject.value.Bean;
import com.absir.server.socket.resolver.SocketBufferResolver;

@Base
@Bean
public class MasterBufferResolver extends SocketBufferResolver {

    public static final MasterBufferResolver ME = BeanFactoryUtils.get(MasterBufferResolver.class);

}
