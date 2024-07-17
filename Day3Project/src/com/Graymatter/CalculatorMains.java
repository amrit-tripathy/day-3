package com.Graymatter;

public class CalculatorMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ScientificCalculator sc = new ScientificCalculator();
//		sc.pow(5,6);
//		
//		ArithmeticCalculator ac = new ScientificCalculator();
//		ac.pow(4, 5);
		
//		Shape s = new Shape();
//		s.getArea();
//		s.getPeri();
//		
//		Square sq = new Square(4);
//		sq.getArea();
//		sq.getPeri();
//		
//		Circle cq = new Circle(3);
//		cq.getArea();
//		cq.getPeri();
//		
//		Shape s1 = new Square(6); //dynamic binding
//		s1.getArea();
		
//		CalculatorInterface ci =new CalculatorInterface() { //another way of providing definition to 
////														unimplemented methods instead of creating a class
//			
//			@Override
//			public int sub(int a, int b) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public int mul(int a, int b) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public int div(int a, int b) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public int add(int a, int b) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
		
//		CalculatorInterface ci =new MyCalculator();
//		ci.add(3, 5);
//		
//		MyScientificCalculator msi = new MyCalculator(); //so whichever parent is pointing their methods will  be implemented
//		msi.pow(8, 9);
//		msi.squart(5);
//			
//		};
		Interface1 i = new Myclass(); //when we have same methods in different interfaces then conflict arises
//											so the method declared inside child will be called
		i.display();
		
		

	}

}
