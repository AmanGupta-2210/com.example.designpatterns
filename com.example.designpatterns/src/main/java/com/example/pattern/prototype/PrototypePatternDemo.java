/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Prototype 
 */

package com.example.pattern.prototype;

/**
 * Utilty class to demonstrate Prototype Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class PrototypePatternDemo {

	public static void main(String[] args) {

		ShapeCache.loadShape();

		Shape clonedShape1 = ShapeCache.getShape("1");
		System.out.println("Shape :" + clonedShape1.getType());

		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape :" + clonedShape2.getType());

		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape :" + clonedShape3.getType());

	}

}
