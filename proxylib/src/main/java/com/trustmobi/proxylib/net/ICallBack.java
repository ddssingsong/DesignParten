package com.trustmobi.proxylib.net;

/**
 * Created by dds on 2018/4/24.
 * 联信摩贝
 */

public interface ICallBack {

    public void onSuccess(String result);

    public void onFailure(int errorCode, String errorMsg);

}
