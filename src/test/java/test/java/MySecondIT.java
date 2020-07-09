package test.java;

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


@ExtendWith( ReporterTestException.class)

public class MySecondIT {

	private static final Calculator calculator = new Calculator();
	private static final Logger logger = LogManager.getLogger( MySecondIT.class );
	//
	//    public static void main(String[] args) {
	//
	//        logger.info(calculator.add2(1,2));
	//
	//    }
	static int a;
	static int b;
	static int c;

	@BeforeEach
	public void beforeTest() {
		logger.info( "@Before Each - Starting test" );

	}

	@AfterEach
	public void afterTest() {
		logger.info( "@After Each - End test\n" );
	}

	@BeforeAll
	public static void beforeAll() {
		logger.info( "Starting my test suite\n" );
		a = 20;
		b = 30;
		c = 40;
	}

	@AfterAll
	public static void afterAll() {
		logger.info( "Ending my test suite" );
	}

	@Tag( "sanity" )
	@Test
	public void testSum() {
		//GIVEN
		Calculator calculator = new Calculator();

		//WHEN
		int sum = calculator.add2( ++a, b++ );

		//THEN
		logger.info( sum );

	}

	@Tag( "sanity" )
	@Test
	public void testMultiply() {
		//GIVEN
		Calculator calculator = new Calculator();

		//WHEN
		int m = calculator.multiply( a, b, c );

		//THEN
		logger.info( m );
	}

}
