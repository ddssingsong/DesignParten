package com.trustmobi.proxylib.net;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by dds on 2018/4/24.
 * 联信摩贝
 */

public abstract class ModelCallback<T> implements ICallBack {


    @Override
    public void onSuccess(String result) {
        Class<? extends T> geneticClass = getGeneticClass(this);
        T t = new Gson().fromJson(result, geneticClass);
        onSuccess(t);


    }

    private Class<? extends T> getGeneticClass(Object object) {
        Type type = object.getClass().getGenericSuperclass();
        return (Class<? extends T>) ((ParameterizedType) type).getActualTypeArguments()[0];
    }


    public abstract void onSuccess(T t);

}
