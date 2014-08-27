/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Bridge 
 */

package com.example.pattern.bridge;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Circle extends Shape {

	private int radius, x, y;

	public Circle(int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
