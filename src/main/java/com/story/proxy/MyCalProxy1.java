package com.story.proxy;

import com.story.proxy.service.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyCalProxy1 {

    public static Object getProxy(final Object object){
        ClassLoader classLoader = object.getClass().getClassLoader();

        Class<?>[] interfaces = object.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object res = null;
                try {
                    res = method.invoke(object, args);
                }catch (Exception e){
                    e.getStackTrace();
                }
                return res;
            }
        };
        Object o = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return o;
    }
}
