/**
 * Copyright 2015 ABSir's Studio
 * <p/>
 * All right reserved
 * <p/>
 * Create on 2015年4月9日 下午8:17:04
 */
package com.absir.slave;

import com.absir.client.SocketAdapter;
import com.absir.client.helper.HelperEncrypt;
import com.absir.core.kernel.KernelObject;
import com.absir.server.in.InModel;
import com.absir.server.in.Input;
import com.absir.server.socket.InputSocket;
import com.absir.server.socket.resolver.SocketBufferResolver;
import com.absir.slave.resolver.SlaveBufferResolver;

import java.io.InputStream;
import java.net.Socket;
import java.nio.channels.SocketChannel;

public class InputSlave extends InputSocket {

    protected SocketAdapter socketAdapter;

    public InputSlave(InModel model, InputSlaveAtt inputSocketAtt, SocketChannel socketChannel) {
        super(model, inputSocketAtt, socketChannel);
        this.socketAdapter = inputSocketAtt.socketAdapter;
    }

    public static boolean onAuthentication(Input input) {
        if (input instanceof InputSlave) {
            return true;
        }

        String slaveKey = input.getParam("_sly");
        if (slaveKey != null) {
            InputSlaveAdapter adapter = InputSlaveContext.ME.getSlaveAdapter().getSocketAdapter();
            Socket socket = adapter.getSocket();
            if (socket != null && KernelObject.equals(adapter.getSlaveKey(), slaveKey)) {
                if (input.getAddress().equals(socket.getInetAddress().getHostAddress())) {
                    return true;

                } else {
                    String slaveHash = input.getParam("_slh");
                    if (slaveHash != null
                            && slaveHash.equals(HelperEncrypt.encryptionMD5(slaveKey, adapter.getKey().getBytes()))) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public SocketAdapter getSocketAdapter() {
        return socketAdapter;
    }

    public void setSocketAdapter(SocketAdapter socketAdapter) {
        this.socketAdapter = socketAdapter;
    }

    @Override
    protected byte writeFlag(byte flag) {
        return (byte) (super.writeFlag(flag) | SocketAdapter.RESPONSE_FLAG);
    }

    @Override
    public SocketBufferResolver getSocketBufferResolver() {
        return SlaveBufferResolver.ME;
    }

    public static class InputSlaveAtt extends InputSocketAtt {

        protected SocketAdapter socketAdapter;

        public InputSlaveAtt(byte[] buffer, byte flag, int off, InputStream inputStream, SocketAdapter socketAdapter) {
            super(null, buffer, flag, off, null, inputStream);
            this.socketAdapter = socketAdapter;
        }
    }
}
