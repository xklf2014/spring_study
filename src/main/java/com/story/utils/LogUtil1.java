package com.story.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

//@Aspect
//@Component
public class LogUtil1 {

    @Before("execution(public Integer com.story.services.impl.CalculatorImpl3.add(Integer,Integer))")
    public static void start(){
        System.out.println("run minus function start,params are ");
    }

    @AfterReturning("execution(public Integer com.story.services.impl.CalculatorImpl3.add(Integer,Integer))")
    public static void end(){
        System.out.println("run divided function end,result is");
    }

    @AfterThrowing("execution(public Integer com.story.services.impl.CalculatorImpl3.add(Integer,Integer))")
    public static void logException(){
        System.out.println("throws");
    }

    @After("execution(public Integer com.story.services.impl.CalculatorImpl3.add(Integer,Integer))")
    public static void logFinally(){
        System.out.println("function run over");
    }
}
