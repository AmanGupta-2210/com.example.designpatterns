/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Strategy 
 */

package com.example.pattern.strategy;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Context {

	private Strategy strategy;

	/**
	 * 
	 * @param strategy
	 *            - Strategy to be used.
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 
	 * @param num1
	 *            - Number 1
	 * @param num2
	 *            - Number 2
	 * @return Result of operation according to the Strategy.
	 */
	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
