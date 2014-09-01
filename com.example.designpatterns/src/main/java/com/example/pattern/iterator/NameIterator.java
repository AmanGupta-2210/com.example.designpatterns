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
public class NameIterator implements Iterator {

	private Object[] array;
	private int index;

	/**
	 * 
	 * @param array
	 *            - Array to be iterated.
	 */
	public NameIterator(Object[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (index < array.length) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			return array[index++];
		}
		return null;
	}

}
