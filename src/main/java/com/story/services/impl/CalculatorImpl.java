package com.story.services.impl;

import com.story.services.Calculator;


public class CalculatorImpl implements Calculator {
    public Integer add(Integer a, Integer b) {
        System.out.println("run add function start,params are "+ a + " and " + b);
        int result = a + b;
        System.out.println("run add function end");
        return result;
    }

    public Integer minus(Integer a, Integer b) {
        System.out.println("run minus function start,params are "+ a + " and " + b);
        int result = a - b;
        System.out.println("run minus function end");
        return result;
    }

    public Integer multiplied(Integer a, Integer b) {
        System.out.println("run multiplied function start,params are "+ a + " and " + b);
        int result = a * b;
        System.out.println("run multiplied function end");
        return result;
    }

    public Integer divided(Integer a, Integer b) {
        System.out.println("run divided function start,params are "+ a + " and " + b);
        int result = a / b;
        System.out.println("run divided function end");
        return result;
    }
}
