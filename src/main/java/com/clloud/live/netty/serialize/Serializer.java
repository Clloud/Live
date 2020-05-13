package com.clloud.live.netty.serialize;

import com.alibaba.fastjson.serializer.JSONSerializer;

public interface Serializer {
    Serializer DEFAULT = (Serializer) new JSONSerializer();

    /**
     * 获取序列化算法
     * @return
     */
    byte getSerializerAlgorithm();

    /**
     * 序列化，将java对象转成二进制数组
     * @param object
     * @return
     */
    byte[] serialize(Object object);


    /**
     * 反序列化，将二进制数组转成java对象
     * @param tClass
     * @param bytes
     * @param <T>
     * @return
     */
    <T> T deserialize(Class<T> tClass, byte[] bytes);
}
