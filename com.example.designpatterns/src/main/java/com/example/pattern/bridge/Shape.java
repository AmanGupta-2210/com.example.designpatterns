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
public abstract class Shape {

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();

}
