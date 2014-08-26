/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Singleton 
 */

package com.example.pattern.singleton;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class SingleObject {

	/**
	 * Only available object of this class.
	 */
	private static SingleObject object = new SingleObject();

	private SingleObject() {
	}

	/**
	 * Factory Method to return Singleton Class Object.
	 * 
	 * @return SingleObject.
	 */
	public static SingleObject getInstance() {
		return object;
	}

	public void showMessage() {
		System.out.println("Singleton Class Demo : Hello World!");
	}
}
