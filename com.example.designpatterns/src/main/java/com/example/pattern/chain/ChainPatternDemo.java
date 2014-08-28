/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Chain of Responsiblity
 */

package com.example.pattern.chain;

/**
 * Utility class to demonstrate Chain of Responsiblity Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class ChainPatternDemo {

	private static AbstractLogger createChainOfLoggers() {

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {

		AbstractLogger loggerChain = createChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO,
				"This is Standard Console Message");
		System.out.println();

		loggerChain.logMessage(AbstractLogger.DEBUG,
				"This is Debug Console Message");
		System.out.println();

		loggerChain.logMessage(AbstractLogger.ERROR,
				"This is Error Console Message");

	}

}
