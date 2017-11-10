package com.kevery.pay.util.http;

public interface RequestHttp<H,P> {

    H getRequestHttpClient();

    P getRequestHttpProxy();
}
