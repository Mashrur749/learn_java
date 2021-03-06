package com.newthinktank;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class CircleToSquareAdapter implements Inscribable {
	/**
	 * the immutable adaptee object of type Squareable
	 **/
	private final Squareable shape;
	
	/**
	 * Constructor - it builds an object of type adapter
	 *
	 * @param shape a Squareable object
	 */
	public CircleToSquareAdapter(Squareable shape) {
		this.shape = shape;
	}
		@Override
		public double circleArea(Squareable shape) {
			double area = shape.squareArea();
			double width = sqrt(area);
			return Math.pow(width / 2.0, 2.0) * PI;
		}
	}
