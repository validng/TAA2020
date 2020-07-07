package com.taa2020;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.taa2020.day12.Calculator;

public class MyTests {

    private static final Calculator calculator = new Calculator();
    private static final Logger logger = LogManager.getLogger(MyTests.class);

    // public static void main(String[] args) {
    //
    //     logger.info(calculator.add2(1,2));
    //
    // }

    @Test
    public void myFirstTest() {
        System.out.println(calculator.add2(1,2));
        assertEquals(4, calculator.add2(1,2));
    }

}
