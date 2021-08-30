package behavior.responsibilityChain.demo;

import behavior.responsibilityChain.logger.AbstractLogger;
import behavior.responsibilityChain.logger.ConsoleLogger;
import behavior.responsibilityChain.logger.ErrorLogger;
import behavior.responsibilityChain.logger.FileLogger;

public class ResponsibilityChainDemo {
    public static void main(String[] args) {
        AbstractLogger chain = getResponsibilityChain();

        chain.logMessage(AbstractLogger.INFO,"This is a piece of information of INFO level");

        chain.logMessage(AbstractLogger.DEBUG,"This is a piece of information of DEBUG level");

        chain.logMessage(AbstractLogger.ERROR,"This is a piece of information of ERROR level");

    }

    private static AbstractLogger getResponsibilityChain(){
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
