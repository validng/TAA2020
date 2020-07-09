package test.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.taa2020.day12.Calculator;


@Tag("sanity")
@ExtendWith(ReporterTestException.class)
public class MySecondIT {

    private static final Logger logger = LogManager.getLogger( MySecondIT.class);

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
        assertEquals( 24000, m );
        assertTrue( m == 24000 );
    }

    @Tag("regression")
    @Tag("security")
    @Test
    public void testSum() {
        // GIVEN
        Calculator calculator = new Calculator();

        // WHEN
        int sum = calculator.add2(++a, b++);

        // THEN
        assertThat( "Sum of numbers failed", sum, is(50) );

    }

    @BeforeAll
    public static void beforeAllTests() {
        logger.info("Starting my tests suite");
        a = 20;
        b = 30;
        c = 40;
    }

    @AfterAll
    public static void afterAllTests() {
        logger.info("Ending my tests suite");
    }

}
