package com.assignment;

public class Employyee extends User{
	private String department;
	

	public Employyee(String name,int id,String department) {
		super(name,id);
		this.department = department;
	}
	

	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public void getdetails() {
		// TODO Auto-generated method stub
		System.out.println("Employyee name:"+ getName()+ "id is:" +getId()+"department is:"+getDepartment());
	}

	@Override
	public void setdetails(String name,int id) {
		// TODO Auto-generated method stub
		System.out.println("set Employyee details");
		setName(name);
		setId(id);
		
	}

}
