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
public interface DrawAPI {

	/**
	 * 
	 * @param radius
	 *            - Radius of the Circle.
	 * @param x
	 *            - X Coordinate of the Center.
	 * @param y
	 *            - Y Coordinate of the Center.
	 */
	public void drawCircle(int radius, int x, int y);
}
