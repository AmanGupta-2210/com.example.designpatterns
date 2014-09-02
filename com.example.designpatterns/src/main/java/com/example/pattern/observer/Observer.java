/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Observer
 */

package com.example.pattern.observer;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public abstract class Observer {

	protected Subject subject;

	public abstract void update();
}
