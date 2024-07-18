package com.assignment;

public class Customer extends User {
	private String CustomerLevel;

	public String getCustomerLevel() {
		return CustomerLevel;
	}

	public void setCustomerLevel(String customerLevel) {
		CustomerLevel = customerLevel;
	}

	
	public Customer(String name, int id,String CustomerLevel) {
		super(name, id);
		// TODO Auto-generated constructor stub
		this.CustomerLevel=CustomerLevel;
		
	}

	@Override
	public void getdetails() {
		// TODO Auto-generated method stub
		System.out.println("Customer name:"+ getName()+ "id is:" +getId()+"level is:"+CustomerLevel);
	}

	@Override
	public void setdetails(String name,int id) {
		// TODO Auto-generated method stub
		System.out.println("set customer details");
		setName(name);
		setId(id);
		
	}

	

}
