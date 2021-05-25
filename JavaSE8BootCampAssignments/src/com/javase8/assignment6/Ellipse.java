package com.javase8.assignment6;

public class Ellipse implements Shape {
	
	private double majorRadius;
	private double minorRadius;
	
	public Ellipse() {
	}
	
	public Ellipse(double majorRadius, double minorRadius) {
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}
	
	@Override
	public double perimeterCalculation() {
		
		return 2 * Math.PI * Math.sqrt(((majorRadius * majorRadius)+(minorRadius*minorRadius))/2);
	}

	@Override
	public double areaCalculation() {
		
		return Math.PI * majorRadius * minorRadius;
	}
}