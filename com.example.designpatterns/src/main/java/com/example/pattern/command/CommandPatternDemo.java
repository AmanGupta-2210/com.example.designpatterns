/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Command
 */

package com.example.pattern.command;

/**
 * Utility class to demonstrate Design Pattern Demo.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class CommandPatternDemo {

	public static void main(String[] args) {

		Broker broker = new Broker();
		Stock stock = new Stock();

		broker.getOrder(new SellStock(stock));
		broker.getOrder(new BuyStock(stock));

		broker.placeOrders();
	}

}
