/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Abstract Factory
 */

package com.example.pattern.abstractfactory;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeName) {

		// Java 8 can use Strings in switch.
		switch (shapeName) {
		case "CIRCLE":
			return new Circle();
		case "RECTANGLE":
			return new Rectangle();
		case "SQUARE":
			return new Square();
		default:
			return null;
		}
	}

	@Override
	Color getColor(String colorName) {
		return null;
	}

}
