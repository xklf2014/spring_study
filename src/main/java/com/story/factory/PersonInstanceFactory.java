package com.story.factory;

import com.story.bean.Person;

//实例工程类
public class PersonInstanceFactory {

    public  Person getInstance(String name){
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        person.setAge(22);
        person.setGender("man");
        return person;
    }
}
