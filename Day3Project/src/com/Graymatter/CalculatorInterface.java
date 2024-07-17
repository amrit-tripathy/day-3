package com.Graymatter;
@FunctionalInterface
public interface CalculatorInterface {
	
	public  int add(int a,int b);
//	public  int sub(int a,int b);
//	public  int mul(int a,int b);
//	public  int div(int a,int b);
	public  default void pow(int a,int b) {
		System.out.println("power");
	};
	public  default void squart(int a) {
		System.out.println("squatrt");
	};

	public static void getDeveloperInfo() {
		System.out.println("ccccc");
	}
	
	
}
