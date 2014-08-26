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
public abstract class AbstractFactory {

	/**
	 * 
	 * @param shapeName
	 *            - Name of the Shape.
	 * @return Shape Object according to shapeName.
	 */
	abstract Shape getShape(String shapeName);

	/**
	 * 
	 * @param colorName
	 *            - Name of the Color.
	 * @return Color Object according to colorName.
	 */
	abstract Color getColor(String colorName);
}
