package com.trustmobi.proxylib.net;

import java.util.Map;

/**
 * Created by dds on 2018/4/24.
 * 联信摩贝
 */

public interface HttpRequest {

    public void get(String url, Map<String, String> param,ICallBack callBack);

    public void post(String url, Map<String, String> param,ICallBack callBack);

}
