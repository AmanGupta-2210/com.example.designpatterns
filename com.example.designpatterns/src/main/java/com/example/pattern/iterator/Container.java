/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Iterator 
 */

package com.example.pattern.iterator;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public interface Container {

	/**
	 * 
	 * @return Iterator to iterate the Container.
	 */
	public Iterator getIterator();

}
