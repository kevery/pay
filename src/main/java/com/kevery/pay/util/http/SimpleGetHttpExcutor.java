package com.kevery.pay.util.http;

import java.io.IOException;

public abstract class SimpleGetHttpExcutor<H, P> implements RequestExcutor<String,String> {
    private RequestHttp<H, P> requestHttp;

    public void setRequestHttp(RequestHttp<H, P> requestHttp) {
        this.requestHttp = requestHttp;
    }


}
