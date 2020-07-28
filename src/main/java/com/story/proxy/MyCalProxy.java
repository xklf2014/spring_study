package com.story.proxy;

import com.story.proxy.service.Calculator;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyCalProxy {

    public static Calculator getProxy(final Calculator calculator){
        ClassLoader classLoader = calculator.getClass().getClassLoader();

        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object res = null;
                try {
                    res = method.invoke(calculator, args);
                }catch (Exception e){
                    e.getStackTrace();
                }
                return res;
            }
        };
        Object o = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return (Calculator) o;
    }
}
