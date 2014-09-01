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
public class NameContainer implements Container {

	private String[] names;

	/**
	 * 
	 * @param names
	 *            - Names that reside inside the container.
	 */
	public NameContainer(String[] names) {
		this.names = names;
	}

	@Override
	public Iterator getIterator() {
		return new NameIterator(names);
	}

}
