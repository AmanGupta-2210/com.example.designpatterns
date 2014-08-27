/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Bridge 
 */

package com.example.pattern.bridge;

/**
 * Utility class to demonstrate Bridge Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class BridgePatternDemo {

	public static void main(String[] args) {

		Shape redCircle = new Circle(10, 100, 100, new RedCircle());
		Shape greenCircle = new Circle(20, 200, 200, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
