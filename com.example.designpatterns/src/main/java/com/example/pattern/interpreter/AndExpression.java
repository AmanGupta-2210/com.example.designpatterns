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
public class AndExpression implements Expression {

	private Expression expression1;
	private Expression expression2;

	/**
	 * 
	 * @param expression1
	 *            - Expression to be ANDed.
	 * @param expression2
	 *            - Expression to be ANDed.
	 */
	public AndExpression(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public boolean interpret(String context) {
		return expression1.interpret(context) && expression2.interpret(context);
	}

}
