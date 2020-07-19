package com.story.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

       /* UserService userService = new UserServiceImpl();
        userService.getUser();*/

/*       UserServiceImpl userService = new UserServiceImpl();
       userService.setUserDao(new UserDaoMysqlImpl());
       userService.getUser();
       System.out.println("-----------");
       userService.setUserDao(new UserDaoOracleImpl());
       userService.getUser();*/

       /* ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = (Person) context.getBean("person");
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person);
        System.out.println(person1);*/

      /*  FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("E:\\javase_study\\spring_study\\src\\ioc.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);*/

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        //Person person = context.getBean("person", Person.class);


    }
}
