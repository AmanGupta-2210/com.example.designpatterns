/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Abstract Factory
 */

package com.example.pattern.abstractfactory;

/**
 * Utility class to demonstrate Abstract Factory Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class AbstractFactoryPatternDemo {

	/**
	 * @param args
	 *            - Command Line Arguments.
	 */
	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		Shape circleShape = shapeFactory.getShape("CIRCLE");
		circleShape.draw();

		Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
		rectangleShape.draw();

		Shape squareShape = shapeFactory.getShape("SQUARE");
		squareShape.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		Color redColor = colorFactory.getColor("RED");
		redColor.fill();

		Color greenColor = colorFactory.getColor("GREEN");
		greenColor.fill();

		Color blueColor = colorFactory.getColor("BLUE");
		blueColor.fill();

	}

}
