package com.story.services.impl;

import com.story.services.Calculator;
import com.story.utils.LogUtil;

import java.lang.reflect.Method;

public class CalculatorImpl2 implements Calculator {
    public Integer add(Integer a, Integer b) {
            Integer result = a + b;
        return result;
    }

    public Integer minus(Integer a, Integer b) {
        Integer result = a - b;
        return result;
    }

    public Integer multiplied(Integer a, Integer b) {
        Integer result = a * b;
        return result;
    }

    public Integer divided(Integer a, Integer b){
        Integer result = a / b;
        return result;
    }
}
