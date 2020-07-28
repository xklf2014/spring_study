package com.story.test;

import com.story.proxy.CalculatorProxy;
import com.story.proxy.CalculatorProxy1;
import com.story.services.Calculator;
import com.story.services.impl.CalculatorImpl2;
import com.story.services.impl.CalculatorImpl3;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorTest3 {

    @Test
    void testadd() throws NoSuchMethodException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculator calculatorImpl3 = context.getBean("calculatorImpl3", Calculator.class);
        calculatorImpl3.add(1,3);

    }


}
