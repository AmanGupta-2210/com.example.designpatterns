/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Chain of Responsiblity
 */

package com.example.pattern.chain;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public abstract class AbstractLogger {

	// Possible Logging Level.
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;

	// Logging Level of Logger.
	protected int level;

	protected AbstractLogger nextLogger;

	/**
	 * 
	 * @param nextLogger
	 *            - Next Logger which can handle request.
	 */
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	/**
	 * 
	 * @param level
	 *            - Level of Message.
	 * @param message
	 *            - Message to be logged.
	 */
	public void logMessage(int level, String message) {
		if (this.level <= level) {
			writeMessage(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	/**
	 * 
	 * @param message
	 *            - Message to be displayed.
	 */
	public abstract void writeMessage(String message);
}
