/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Singleton 
 */

package com.example.pattern.singleton;

/**
 * Utility class to demonstrate Singleton Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {

		/*
		 * This code will not work. It will give compile time error.
		 * 
		 * SingleObject object=new SingleObject();
		 */

		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}

}
