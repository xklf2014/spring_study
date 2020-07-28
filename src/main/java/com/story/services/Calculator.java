package com.story.services;

import org.springframework.stereotype.Service;

//@Service
public interface Calculator {
    Integer add(Integer a, Integer b) throws NoSuchMethodException;

    Integer minus(Integer a,Integer b) throws NoSuchMethodException;

    Integer multiplied(Integer a , Integer b) throws NoSuchMethodException;

    Integer divided(Integer a, Integer b) throws NoSuchMethodException;
}
