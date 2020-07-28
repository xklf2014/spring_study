package com.story.services.impl;

import com.story.services.Calculator;
import com.story.utils.LogUtil;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
@Service
public class CalculatorImpl1 implements Calculator {
    LogUtil logUtil = new LogUtil();
    public Integer add(Integer a, Integer b) throws NoSuchMethodException {
        Method add = CalculatorImpl1.class.getMethod("add", Integer.class, Integer.class);
        logUtil.start(add,a,b);
        Integer result = a + b;
        logUtil.end(result);

        return result;
    }

    public Integer minus(Integer a, Integer b) throws NoSuchMethodException {
        Method minus = CalculatorImpl1.class.getMethod("minus", Integer.class, Integer.class);
        logUtil.start(minus,a,b);
        Integer result = a - b;
        logUtil.end(result);
        return result;
    }

    public Integer multiplied(Integer a, Integer b) throws NoSuchMethodException {
        Method multiplied = CalculatorImpl1.class.getMethod("multiplied", Integer.class, Integer.class);
        logUtil.start(multiplied,a,b);
        Integer result = a * b;
        logUtil.end(result);
        return result;
    }

    public Integer divided(Integer a, Integer b) throws NoSuchMethodException {
        Method divided = CalculatorImpl1.class.getMethod("divided", Integer.class, Integer.class);
        logUtil.start(divided,a,b);
        Integer result = a / b;
        logUtil.end(result);
        return result;
    }
}
