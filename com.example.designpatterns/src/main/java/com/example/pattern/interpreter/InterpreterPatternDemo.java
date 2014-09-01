/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Interpreter 
 */

package com.example.pattern.interpreter;

/**
 * Utility class to demonstrate Interpreter Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class InterpreterPatternDemo {

	// Rule : Aman and Amar are Male.
	private static Expression getMaleExpression() {
		Expression aman = new TerminalExpression("Aman");
		Expression amar = new TerminalExpression("Amar");
		return new OrExpression(aman, amar);
	}

	// Rule : Julia is Married.
	private static Expression getMarriedFemaleExpression() {
		Expression julia = new TerminalExpression("Julia");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(married, julia);
	}

	public static void main(String[] args) {

		Expression maleExpression = getMaleExpression();
		Expression marriedFemaleExpression = getMarriedFemaleExpression();

		System.out.println("Is Amar Male ? :"
				+ maleExpression.interpret("Amar"));
		System.out.println("Is Julia Male ? :"
				+ maleExpression.interpret("Julia"));
		System.out.println("Is Julia Married ? :"
				+ marriedFemaleExpression.interpret("Married Julia"));
		System.out.println("Is Aman Married ? :"
				+ marriedFemaleExpression.interpret("Married Aman"));
	}
}
