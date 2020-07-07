package test.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.taa2020.day12.Calculator;

public class MyTests {

    private static final Calculator calculator = new Calculator();
    private static final Logger logger = LogManager.getLogger(MyTests.class);

    public static void main(String[] args) {

        logger.info(calculator.add2(1,2));

    }

}
