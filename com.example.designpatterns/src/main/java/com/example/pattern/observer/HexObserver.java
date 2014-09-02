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
public class HexObserver extends Observer {

	public HexObserver(Subject subject) {
		super.subject = subject;
		super.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hexadecimal State Updated :"
				+ Integer.toHexString(subject.getState()));
	}

}
