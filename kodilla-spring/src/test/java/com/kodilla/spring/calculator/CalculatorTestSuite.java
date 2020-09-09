package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.main.allow-bean-definition-overriding=true")
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double addResult = calculator.add(5.5, 3.2);
        double subResult = calculator.sub(10.3, 0.3);
        double mulResult = calculator.mul(2.5, 0.5);
        double divResult =  calculator.div(8.9, 3);
        double divBy0Result = calculator.div(1, 0);
        //Then
        Assert.assertEquals(8.7, addResult, 0.001);
        Assert.assertEquals(10, subResult, 0.001);
        Assert.assertEquals(1.25, mulResult, 0.001);
        Assert.assertEquals(2.966, divResult, 0.001);
        Assert.assertTrue(Double.isInfinite(divBy0Result));
    }
}
