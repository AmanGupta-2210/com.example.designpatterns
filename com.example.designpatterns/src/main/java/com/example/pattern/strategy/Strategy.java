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
public interface Strategy {

	/**
	 * 
	 * @param num1
	 *            - Number 1
	 * @param num2
	 *            - Number 2
	 * @return Result of operation.
	 */
	public int doOperation(int num1, int num2);
}
