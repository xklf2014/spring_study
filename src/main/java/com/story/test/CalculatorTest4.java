package com.story.test;

import com.story.services.Calculator;
import com.story.services.impl.CalculatorImpl3;
import com.story.services.impl.CalculatorImpl4;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorTest4 {

    @Test
    void testadd() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CalculatorImpl4 calculatorImpl4 = context.getBean(CalculatorImpl4.class);
        //System.out.println(calculatorImpl4);
        System.out.println(calculatorImpl4.getClass());


    }


}
