package com.assignment;

public class Employee {
	String name;
	int id;
	double salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public double calculateNetSalary() {
        double hra, ta, da, it;

        if (salary >= 70 && salary <= 90) {
            hra = salary * 0.15;
            ta = salary * 0.10;
            da = salary * 0.10;
            it = salary * 0.11;
        } else if (salary >= 50 && salary < 70) {
            hra = salary * 0.13;
            ta = salary * 0.08;
            da = salary * 0.08;
            it = salary * 0.09;
        } else if (salary >= 30 && salary < 50) {
            hra = salary * 0.10;
            ta = salary * 0.07;
            da = salary * 0.07;
            it = salary * 0.09;
        } else {
            hra = 0;
            ta = 0;
            da = 0;
            it = 0;
        }

        return salary - hra - ta - da + it;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", calculateNetSalary()="
				+ calculateNetSalary() + "]";
	}
	
		

}
