package com.trustmobi.proxylib.net;

import java.util.Map;

/**
 * Created by dds on 2018/4/24.
 * 联信摩贝
 */

public class HttpRequestPresenter implements HttpRequest {
    private HttpRequest httpRequest;

    private HttpRequestPresenter(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    private volatile static HttpRequestPresenter instance = null;


    public static HttpRequestPresenter init(HttpRequest request) {
        if (instance == null) {
            synchronized (HttpRequestPresenter.class) {
                if (instance == null) {
                    instance = new HttpRequestPresenter(request);
                }
            }
        }
        return instance;
    }


    @Override
    public void get(String url, Map<String, String> param, ICallBack callBack) {
        httpRequest.get(url, param, callBack);
    }

    @Override
    public void post(String url, Map<String, String> param, ICallBack callBack) {

    }
}
