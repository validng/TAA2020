package test.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;

public class ReporterTestException implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private static final Logger logger = LogManager.getLogger( ReporterTestException.class );

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        String className = extensionContext.getTestClass().get().getName();
        String methodName = extensionContext.getTestMethod().get().getName();
        // Set<String> tagName = extensionContext.getTags();
        logger.info("Test " + methodName + " from " + className + " finished executing");
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        String className = extensionContext.getTestClass().get().getName();
        String methodName = extensionContext.getTestMethod().get().getName();
        logger.info("Test " + methodName + " from " + className + " started executing");
    }

}
