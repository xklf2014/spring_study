package com.story.factory;

import com.story.bean.Person;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Person> {

    //返回获取的bean
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setId(3);
        person.setName("wangwu");
        person.setAge(11);
        return person;
    }

    //获取返回bean的类型
    public Class<?> getObjectType() {
        return Person.class;
    }

    //判断当前bean是否是单例
    public boolean isSingleton() {
        return false;
    }
}
