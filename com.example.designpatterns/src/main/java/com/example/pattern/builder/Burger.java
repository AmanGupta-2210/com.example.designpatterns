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
public abstract class Burger implements Item {

	@Override
	public abstract String name();

	@Override
	public abstract float price();

	@Override
	public Packing packing() {
		return new Wrapper();
	}

}
