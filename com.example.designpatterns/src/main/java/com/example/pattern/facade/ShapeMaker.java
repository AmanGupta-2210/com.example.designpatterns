/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Facade
 */

package com.example.pattern.facade;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class ShapeMaker {

	private Circle circle;
	private Square square;
	private Rectangle rectangle;

	public ShapeMaker() {
		this.circle = new Circle();
		this.square = new Square();
		this.rectangle = new Rectangle();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}
}
