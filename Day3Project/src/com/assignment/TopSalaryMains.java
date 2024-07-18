package com.assignment;

public class TopSalaryMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp = new Employee[5];
		emp[0] = new Employee("amrit",123,70);
		emp[1] = new Employee("shyam",345,50);
		emp[2] = new Employee("ram",678,40);
		emp[3] = new Employee("ramesh",459,30);
		emp[4] = new Employee("suresh",165,60);
		
		Employee highestEmployee = emp[0];
		
		for(Employee e:emp) {
			if(e.calculateNetSalary()>highestEmployee.calculateNetSalary()) {
				highestEmployee = e;
			}
		}
		
		System.out.println("highest employee is: "+highestEmployee.toString());
		
		
		

	}

}

