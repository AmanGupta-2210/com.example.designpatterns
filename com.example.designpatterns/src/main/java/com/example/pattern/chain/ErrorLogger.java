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
public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	public void writeMessage(String message) {
		System.out.println("Error Console Logger :" + message);

	}

}
