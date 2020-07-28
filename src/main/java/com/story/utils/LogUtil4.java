package com.story.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;


public class LogUtil4 {

    //@Pointcut("execution(public Integer com.story.services.*.Cal*latorImpl*.*(Integer,Integer))")
    public void pointCut(){}

    //@Pointcut(value = "execution(public Integer com.story..CalculatorImpl*.*(Integer,Integer)))")
    public void pointCut1(){}


    //@Before(value = "pointCut()")
    public static void start(JoinPoint joinPoint)
    {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println(signature.getName()+" function start,params are " + Arrays.asList(args));

    }

    //@AfterReturning(value = "pointCut1()",returning="result")
    private static void end(JoinPoint joinPoint,Object result){
        Signature signature = joinPoint.getSignature();
        System.out.println( signature.getName() +" function end,result is \t" + result.toString() );
    }

    //@AfterThrowing(value = "execution(public * *(..))",throwing="e")
    public static void logException(JoinPoint joinPoint,Exception e){
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName() + " throws " + e.getMessage());
    }

    //@After("!execution(public Integer com.story.services.impl.CalculatorImpl3.*(Integer,*))")
    private static int logFinally(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName() + " function run over");
        return 100;
    }

    //@Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        Object res = null;

        try {
            System.out.println(signature.getName() + "around advice start "+ Arrays.asList(args));
            res = joinPoint.proceed();
            System.out.println(signature.getName() + "around advice over");
        } catch (Throwable throwable) {
            throw throwable;
        }finally {
            //System.out.println("returing " + res.toString());
            res = 100;
        }
        return res;
    }
}
