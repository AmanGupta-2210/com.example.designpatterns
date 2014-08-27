/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Flyweight
 */

package com.example.pattern.flyweight;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Circle implements Shape {

	private String color;
	private int x;
	private int y;
	private int radius;

	/**
	 * 
	 * @param color
	 *            - Color of Circle.
	 */
	public Circle(String color) {
		this.color = color;
	}

	/**
	 * 
	 * @param x
	 *            - X Coordinate of Center of Circle.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * 
	 * @param y
	 *            - Y Coordinate of Center of Circle.
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 
	 * @param radius
	 *            - Radius of Circle.
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle Color :" + color);
		System.out.println("X :" + x + ", Y :" + y + " and Radius :" + radius);
	}

}
