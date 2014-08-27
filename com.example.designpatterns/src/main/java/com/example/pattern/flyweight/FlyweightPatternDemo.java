/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Flyweight
 */

package com.example.pattern.flyweight;

/**
 * Utility class to demonstrate Flyweight Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class FlyweightPatternDemo {

	private static final String[] colors = { "Red", "Green", "Blue", "Brown",
			"Grey" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());

			circle.setX(getRandomNumber());
			circle.setY(getRandomNumber());
			circle.setRadius(100);

			circle.draw();
			System.out.println();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomNumber() {
		return (int) (Math.random() * 100);
	}

}