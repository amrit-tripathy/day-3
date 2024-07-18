package com.Graymatter;

import java.lang.annotation.Annotation;

public class DemoOnFunctionalInterface implements MyfunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOnFunctionalInterface dof = new DemoOnFunctionalInterface();
		System.out.println(dof.cubeOfnum(5));
		MyfunctionalInterface mfi = dof;
		System.out.println(mfi.cubeOfnum(6));

	}

	@Override
	public int cubeOfnum(int num) {
		// TODO Auto-generated method stub
		return num*num*num;
	}

	
	

}
