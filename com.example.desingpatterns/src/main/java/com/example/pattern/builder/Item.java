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
public interface Item {

	/**
	 * 
	 * @return Name of the Item.
	 */
	public String name();

	/**
	 * 
	 * @return Price of the Item.
	 */
	public float price();

	/**
	 * 
	 * @return Type of packaging of the Item.
	 */
	public Packing packing();
}
