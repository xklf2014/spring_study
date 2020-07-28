package com.story.test;

import com.story.services.Calculator;
import com.story.services.CalculatorImpl5;
import com.story.services.impl.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorTest5 {
    //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

    @Test
    void testadd() throws NoSuchMethodException {
        CalculatorImpl1 calculator = context.getBean("calculatorImpl1",CalculatorImpl1.class);
        calculator.add(1,3);
        //calculator.divided(1,1);
        System.out.println(calculator.getClass());

    }

    @Test
    void testadd2() throws NoSuchMethodException {
        CalculatorImpl4 calculatorImpl = context.getBean("calculatorImpl4", CalculatorImpl4.class);
        System.out.println(calculatorImpl.add(1, 3));
        //calculatorImpl.divided(1,0);
        //System.out.println(calculatorImpl);
    }

    @Test
    void testadd3() throws NoSuchMethodException {
        Calculator calculatorImpl = context.getBean("calculatorImpl3", Calculator.class);
        System.out.println(calculatorImpl.add(1, 3));
        //calculatorImpl.divided(1,0);
        //System.out.println(calculatorImpl);
    }

    @Test
    void testAopXml() throws NoSuchMethodException {
        Calculator calculatorImpl3 = context.getBean("calculatorImpl3",Calculator.class);
        calculatorImpl3.add(1,3);
    }

}
