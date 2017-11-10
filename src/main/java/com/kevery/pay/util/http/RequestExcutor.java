package com.kevery.pay.util.http;

import java.io.IOException;

/**
 * http请求执行器
 *
 * @param <T> 返回值类型
 * @param <E> 请求参数类型
 */
public interface RequestExcutor<T, E> {

    /**
     * 执行请求
     * @param url 请求地址
     * @param data 数据
     * @return
     * @throws IOException
     */
    T execute(String url, E data) throws IOException;
}
