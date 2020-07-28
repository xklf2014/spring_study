package com.story.services.impl;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl4 {
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
