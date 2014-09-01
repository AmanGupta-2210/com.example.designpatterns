/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Interpreter 
 */

package com.example.pattern.interpreter;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class TerminalExpression implements Expression {

	private String data;

	/**
	 * 
	 * @param data
	 *            - Data associated to the Expression
	 */
	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}

}
