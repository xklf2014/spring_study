package com.story.test;

import com.story.controller.BaseControllor;
import com.story.services.StudentService;
import com.story.services.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    void test1(){
        //BaseControllor baseControllor = context.getBean("baseControllor", BaseControllor.class);
        /*baseControllor.save();
        baseControllor.save2();*/

        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.save();

        TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
        teacherService.save();

    }
}
