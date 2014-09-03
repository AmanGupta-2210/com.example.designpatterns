/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Strategy 
 */

package com.example.pattern.strategy;

/**
 * Utility class to demonstrate Strategy Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {

		Context context = new Context(new StrategyAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new StrategySub());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new StrategyMul());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

	}
}
