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
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	public void writeMessage(String message) {
		System.out.println("Standard Console Logger :" + message);
	}

}
