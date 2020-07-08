package test.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.taa2020.day12.Calculator;

public class MyTests  {

    private static final Logger logger = LogManager.getLogger(MyTests.class);

    private static int a;

    private static int b;

    private static int c;

    @BeforeEach
    public void beforeTest() {
        logger.info("Starting a test");

    }

    @AfterEach
    public void afterTest() {
        logger.info("Ending a test");
    }

    @Test
    public void testMultiply() {
        // GIVEN
        Calculator calculator = new Calculator();

        // WHEN
        int m = calculator.multiply(a, b, c);

        // THEN
        logger.info(m);
    }

    @Test
    public void testSum() {
        // GIVEN
        Calculator calculator = new Calculator();

        // WHEN
        int sum = calculator.add2(++a, b++);

        // THEN
        logger.info(sum);

    }

    @BeforeAll
    public static void beforeAllTests() {
        logger.info("Starting my tests suite");
        a = 2;
        b = 3;
        c = 4;
    }

    @AfterAll
    public static void afterAllTests() {
        logger.info("Ending my tests suite");
    }


}
