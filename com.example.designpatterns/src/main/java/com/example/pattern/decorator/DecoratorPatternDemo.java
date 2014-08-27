/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Decorator 
 */

package com.example.pattern.decorator;

/**
 * Utility class to demonstrate Decorator Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {

		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape greenCircle = new GreenShapeDecorator(new Circle());

		Shape square = new Square();
		Shape redSquare = new RedShapeDecorator(new Square());
		Shape greenSquare = new GreenShapeDecorator(new Square());

		circle.draw();
		System.out.println();

		redCircle.draw();
		System.out.println();

		greenCircle.draw();
		System.out.println();

		square.draw();
		System.out.println();

		redSquare.draw();
		System.out.println();

		greenSquare.draw();
		System.out.println();
	}

}
