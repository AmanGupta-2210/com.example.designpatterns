/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Factory 
 */

package com.example.pattern.factory;

/**
 * Factory Class to create Shape.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class ShapeFactory {

	/**
	 * 
	 * @param shapeName
	 *            - Name of the Shape.
	 * @return Shape Object according to shapeName.
	 */
	public Shape getShape(String shapeName) {

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
}
