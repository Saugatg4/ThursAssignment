package com.skillstorm.shape;

public class Shape {
	private double area;

	public double  perimeter() {
		return area;
	}

	public void setSides(int sides) {
		this.area = sides;
	}

	public String toString() {
		if (area == 0) {
			return "Cannot have a Shape with no sides";
		} 
		else 
		return String.format("This Shape has %d sides.", area);
	}
}


