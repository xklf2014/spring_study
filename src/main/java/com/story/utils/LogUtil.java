package com.story.utils;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogUtil {

    public static void start(Method method,Object... objects){
        System.out.println(method.getName()+"run minus function start,params are "+ Arrays.asList(objects));
    }

    public static void end(Object... objects){
        System.out.println("run divided function end,result is" + Arrays.asList(objects));
    }

    public static void logException(Method method,Exception e){
        System.out.println(method.getName() + "throws" + e.getMessage());
    }

    public static void logFinally(Method method){
        System.out.println(method.getName() + "function run over");
    }
}
