package com.Graymatter;

public class Square extends Shape {
	
	double side;

	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}
	public void getArea() {
		System.out.println(side * side);
	}
	public void getPeri() {
		System.out.println(4 * side);
	}

}
