/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Proxy
 */

package com.example.pattern.proxy;

/**
 * Utility class to demonstrate Proxy Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {

		Image image = new ProxyImage("temp.jpg");

		// Loading and Displaying Image.
		image.display();
		System.out.println();

		// Displaying Image without loading.
		image.display();
	}

}
