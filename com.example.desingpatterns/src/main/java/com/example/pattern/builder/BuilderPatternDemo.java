/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Builder 
 */

package com.example.pattern.builder;

/**
 * Utility Class to demonstrate Builder Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("**Veg Meal**");
		vegMeal.showItems();
		System.out.println("Total Price :" + vegMeal.getPrice());

		System.out.println("\n\n");

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("**Non-Veg Meal**");
		nonVegMeal.showItems();
		System.out.println("Total Price :" + nonVegMeal.getPrice());
	}

}
