/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Factory 
 */

package com.example.pattern.factory;

/**
 * Utility Class to demonstrate Factory Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class FactoryPatternDemo {

	/**
	 * @param args
	 *            - Command Line Arguments.
	 */
	public static void main(String[] args) {

		ShapeFactory factory = new ShapeFactory();

		Shape circleShape = factory.getShape("CIRCLE");
		circleShape.draw();

		Shape rectangleShape = factory.getShape("RECTANGLE");
		rectangleShape.draw();

		Shape squareShape = factory.getShape("SQUARE");
		squareShape.draw();

	}

}
