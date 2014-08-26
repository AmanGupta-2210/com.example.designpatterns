/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Abstract Factory
 */

package com.example.pattern.abstractfactory;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class FactoryProducer {

	/**
	 * 
	 * @param choice
	 *            - Name of the factory.
	 * @return Factory Object according to choice.
	 */
	public static AbstractFactory getFactory(String choice) {

		// Java 8 can use Strings in switch.
		switch (choice) {
		case "COLOR":
			return new ColorFactory();
		case "SHAPE":
			return new ShapeFactory();
		default:
			return null;
		}
	}
}
