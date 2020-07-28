package com.story.proxy;

import com.story.services.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorProxy {

    public static Calculator getCalculator(final Calculator calculator){
        ClassLoader classLoader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        InvocationHandler hander = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName()+" function start,params are "+ Arrays.asList(args));
                Object result = method.invoke(calculator,args);
                System.out.println(method.getName()+" function end,result is \t" + result);
                return result;
            }
        };

        Object o = Proxy.newProxyInstance(classLoader, interfaces, hander);
        return (Calculator) o;
    }
}
