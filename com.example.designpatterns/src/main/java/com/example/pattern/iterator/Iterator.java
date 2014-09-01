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
public interface Iterator {

	/**
	 * 
	 * @return Whether container has next object or not.
	 */
	public boolean hasNext();

	/**
	 * 
	 * @return Next Object in the container.
	 */
	public Object next();
}
