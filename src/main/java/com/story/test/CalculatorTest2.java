package com.story.test;

import com.story.proxy.CalculatorProxy;
import com.story.proxy.CalculatorProxy1;
import com.story.services.Calculator;
import com.story.services.impl.CalculatorImpl2;
import org.junit.jupiter.api.Test;

public class CalculatorTest2 {

    @Test
    void testadd() throws NoSuchMethodException {
        Calculator calculator = CalculatorProxy.getCalculator(new CalculatorImpl2());
        calculator.add(1,3);
        calculator.minus(3,1);
        calculator.multiplied(2,3);
        calculator.divided(2,1);
    }

    @Test
    void testProxycalculator() throws NoSuchMethodException {
        Calculator calculator = CalculatorProxy1.getCalculator(new CalculatorImpl2());
        calculator.add(1,3);
        calculator.divided(3,0);

        System.out.println(calculator.getClass());

    }

}
