/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Builder 
 */

package com.example.pattern.builder;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 15.0F;
	}

}
