/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Prototype 
 */

package com.example.pattern.prototype;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public abstract class Shape implements Cloneable {

	/**
	 * Id of the Shape.
	 */
	private String id;

	/**
	 * Type of the Shape.
	 */
	protected String type;

	public abstract void draw();

	/**
	 * 
	 * @param id
	 *            - Id of the Shape.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return Id of the Shape.
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @return Type of the Shape.
	 */
	public String getType() {
		return type;
	}

	/**
	 * Mehtod used to clone the 'this' object.
	 */
	public Shape clone() {
		Shape clone = null;
		try {
			clone = (Shape) super.clone();
		} catch (CloneNotSupportedException exception) {
			System.out.println("Exception :" + exception);
			exception.printStackTrace();
		}
		return clone;
	}
}
