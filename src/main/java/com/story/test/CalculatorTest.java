package com.story.test;

import com.story.services.Calculator;
import com.story.services.impl.CalculatorImpl;
import com.story.services.impl.CalculatorImpl1;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new CalculatorImpl();
    Calculator calculator1 = new CalculatorImpl1();

    @Test
    void testAdd() throws NoSuchMethodException {
        int add = calculator.add(1, 3);
        System.out.println(add);
    }

    @Test
    void testAdd1() throws NoSuchMethodException {
        int add = calculator1.add(1, 3);
        System.out.println(add);
    }


}
