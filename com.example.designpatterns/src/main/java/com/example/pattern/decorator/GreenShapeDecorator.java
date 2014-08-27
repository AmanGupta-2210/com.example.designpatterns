/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Decorator 
 */

package com.example.pattern.decorator;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class GreenShapeDecorator extends ShapeDecorator {

	public GreenShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setGreenBorder(decoratedShape);
	}

	private void setGreenBorder(Shape decoratedShape) {
		System.out.println("Border Color : Green");
	}

}
