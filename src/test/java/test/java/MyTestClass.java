package test.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.taa2020.day1.Calculator;

public class MyTestClass {

    private final Calculator calculator = new Calculator();

    @Test
    public void myFirstTest() {
        System.out.println(calculator.add2(1,2));
        assertEquals(3, calculator.add2(1,2));
    }

}
