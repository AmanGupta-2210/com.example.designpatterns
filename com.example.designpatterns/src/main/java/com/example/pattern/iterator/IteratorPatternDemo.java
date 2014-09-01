/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Iterator 
 */

package com.example.pattern.iterator;

/**
 * Utility class to demonstrate Iterator Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class IteratorPatternDemo {

	public static void main(String[] args) {

		String[] names = { "Aman", "Amar", "Himanshu", "Piyush", "Gunjan",
				"Ankit", "Shruthi" };

		Container nameContainer = new NameContainer(names);
		Iterator iterator = nameContainer.getIterator();

		for (; iterator.hasNext();) {
			System.out.println("Name :" + iterator.next());
		}
	}

}
