/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Observer
 */

package com.example.pattern.observer;

/**
 * Utility class to demonstrate Observer Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class ObserverPatternDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Subject subject = new Subject();

		Observer binaryObserver = new BinaryObserver(subject);
		Observer octalObserver = new OctalObserver(subject);
		Observer hexObserver = new HexObserver(subject);

		System.out.println("State changed to 10");
		subject.setState(10);
		System.out.println();

		System.out.println("State changed to 14");
		subject.setState(14);

	}

}
