package com.lxr.iot.bootstrap.channel.mqtt.publish;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * 跨线程情况下 byteBuf 需要转换成byte[]
 *
 * @author lxr
 * @create 2017-11-29 9:07
 **/
public class ByteBufUtil {

    public  static byte[]  copyByteBuf(ByteBuf byteBuf){
        byte[] bytes = new byte[byteBuf.readableBytes()];
        byteBuf.readBytes(bytes);
        return bytes;
    }
}
