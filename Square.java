package com.newthinktank;

public class Square implements Squareable {
	private double width;
	/**
	 * Construct a new Square with the specified width
	 * @param width the width of the new Square
	 */
	public Square(double width) {
		this.width = width;
	}
	/**
	 * Get the area of this Square.
	 * @return the area of this Square.
	 */
	public double squareArea() {
		return width * width;
	}

	@Override
	public String toString() {
		return "Square width=" + width;
	}
}
