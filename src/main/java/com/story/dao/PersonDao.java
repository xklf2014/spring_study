package com.story.dao;

import org.springframework.stereotype.Component;


@Component
public class PersonDao {

    public void save(){
        System.out.println("save success");
    };
}