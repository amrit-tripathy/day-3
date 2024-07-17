package com.Graymatter;

public  abstract class ArithmeticCalculator extends AbstractCalculator {

	private int a,b;
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public abstract int pow(int a, int b);

	@Override
	public abstract int squart(int a);

	

}
