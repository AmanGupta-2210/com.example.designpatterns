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
public interface Expression {

	/**
	 * 
	 * @param context
	 *            - Context to be checked.
	 * @return Context is true or not.
	 */
	public boolean interpret(String context);
}
