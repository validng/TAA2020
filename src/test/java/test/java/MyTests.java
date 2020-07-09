package test.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.taa2020.day12.BasicCalculator;
import com.taa2020.day12.Calculator;

@Tag("regression")
@ExtendWith(ReporterTestException.class)
public class MyTests {

    private static final Logger logger = LogManager.getLogger(MyTests.class);

    private static int a;

    private static int b;

    private static int c;

    @BeforeEach
    public void beforeTest() {
        logger.info(" @BeforeEach - Starting a test");

    }

    @AfterEach
    public void afterTest() {
        logger.info("@AfterEach - Ending a test");
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

    @Test
    public void testDivide() {
        // GIVEN
        BasicCalculator bc = new BasicCalculator();

        // WHEN
        double d = bc.divide( 20, 6 );

        // THEN
        assertThat( d, closeTo(3.3, 0.034) );
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
