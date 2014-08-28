/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Command
 */

package com.example.pattern.command;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Stock {

	private String name = "BOI";
	private int cost = 100;

	public void buy() {
		System.out.println("Buying Stock");
		System.out.println("Name :" + name);
		System.out.println("Cost :" + cost);
	}

	public void sell() {
		System.out.println("Selling Stock");
		System.out.println("Name :" + name);
		System.out.println("Cost :" + cost);
	}
}
