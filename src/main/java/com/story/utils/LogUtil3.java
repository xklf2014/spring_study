package com.story.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(value = 1)
public class LogUtil3 {

    @Pointcut("execution(public Integer com.story.services.*.Cal*latorImpl*.*(Integer,Integer))")
    public void pointCut(){}

    @Pointcut(value = "execution(public Integer com.story..CalculatorImpl*.*(Integer,Integer)))")
    public void pointCut1(){}


    @Before(value = "pointCut()")
    public static void start(JoinPoint joinPoint)
    {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("logutil3" + signature.getName()+" function start,params are " + Arrays.asList(args));

    }

    @AfterReturning(value = "pointCut1()",returning="result")
    public static void end(JoinPoint joinPoint,Object result){
        Signature signature = joinPoint.getSignature();
        System.out.println("logutil3" +  signature.getName() +" function end,result is \t" + result.toString() );
    }

    @AfterThrowing(value = "execution(public * *(..))",throwing="e")
    public static void logException(JoinPoint joinPoint,Exception e){
        Signature signature = joinPoint.getSignature();
        System.out.println("logutil3" + signature.getName() + " throws " + e.getMessage());
    }

    @After("execution(public Integer com.story.services.impl.CalculatorImpl3.*(Integer,Integer))")
    public static void logFinally(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("logutil3" + signature.getName() + " function run over");
    }


}
