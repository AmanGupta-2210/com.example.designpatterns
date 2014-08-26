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
public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeName) {
		return null;
	}

	@Override
	Color getColor(String colorName) {

		// Java 8 can use Strings in switch.
		switch (colorName) {
		case "RED":
			return new Red();
		case "GREEN":
			return new Green();
		case "BLUE":
			return new Blue();
		default:
			return null;
		}
	}

}
