/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Prototype 
 */

package com.example.pattern.prototype;

import java.util.Hashtable;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class ShapeCache {

	private static Hashtable<String, Shape> shapeTable = new Hashtable<String, Shape>();

	/**
	 * 
	 * @param id
	 *            - Id of the Shape Object to be cloned.
	 * @return Cloned Shape Object.
	 */
	public static Shape getShape(String id) {
		Shape cachedShape = shapeTable.get(id);
		return cachedShape.clone();
	}

	public static void loadShape() {
		Shape circleShape = new Circle();
		circleShape.setId("1");
		shapeTable.put(circleShape.getId(), circleShape);

		Shape rectangleShape = new Rectangle();
		rectangleShape.setId("2");
		shapeTable.put(rectangleShape.getId(), rectangleShape);

		Shape squareShape = new Square();
		squareShape.setId("3");
		shapeTable.put(squareShape.getId(), squareShape);
	}
}
