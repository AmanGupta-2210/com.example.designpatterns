/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Flyweight
 */

package com.example.pattern.flyweight;

import java.util.HashMap;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class ShapeFactory {

	private static HashMap<String, Shape> circleMap = new HashMap<>();

	/**
	 * 
	 * @param color
	 *            - Color of shape to be created.
	 * @return Newly created or existing Shape Object.
	 */
	public static Shape getShape(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating Circle of " + color + " color.");
		}

		return circle;
	}
}
