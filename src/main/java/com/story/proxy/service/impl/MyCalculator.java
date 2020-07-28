package com.story.proxy.service.impl;

import com.story.proxy.service.Calculator;

public class MyCalculator implements Calculator {
    @Override
    public Integer add(int i, int j) {
        return i + j;
    }

    @Override
    public Integer mins(int i, int j) {
        return i - j;
    }

    @Override
    public Integer mul(int i, int j) {
        return i * j;
    }

    @Override
    public Integer sub(int i, int j) {
        return i / j;
    }
}
