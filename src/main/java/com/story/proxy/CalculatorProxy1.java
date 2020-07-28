package com.story.proxy;

import com.story.services.Calculator;
import com.story.utils.LogUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorProxy1 {

    public static Calculator getCalculator(final Calculator calculator){
        ClassLoader classLoader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        InvocationHandler hander = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    LogUtil.start(method, args);
                    result = method.invoke(calculator, args);
                    LogUtil.end(result);
                }catch (Exception e){
                    LogUtil.logException(method,e);
                }finally {
                    LogUtil.logFinally(method);
                }
                return result;
            }
        };

        Object o = Proxy.newProxyInstance(classLoader, interfaces, hander);
        return (Calculator) o;
    }
}
