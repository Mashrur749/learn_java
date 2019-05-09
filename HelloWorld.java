
package com.newthinktank;
import java.util.*;



public class HelloWorld {
	public static void main(String[] args) {
		/* create an object of type Squareable */
		Squareable square = new Square(2.0);
		/**
		 * create an object of type Inscribable
		 * as an adapter to calculate the circle area
		 */
		Inscribable adapter = new CircleToSquareAdapter(square);
		//use the adapter and calculate the area of the circle inscribed
		double area = adapter.circleArea(square);
		//print the result
		System.out.println("The Area of the circle inscribed in the" +
				" [" + square + "] is " + area );
	}
}
