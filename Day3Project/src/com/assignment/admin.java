package com.assignment;

public class admin extends User {
	
	private String adminRole;

	public admin(String name, int id, String adminRole) {
		super(name, id);
		this.adminRole = adminRole;
	}

	public String getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}

	@Override
	public void getdetails() {
		// TODO Auto-generated method stub
		System.out.println("admin details: "+getName()+"id is :"+getId()+" role is :"+adminRole);
	}


	@Override
	public void setdetails(String name, int id) {
		// TODO Auto-generated method stub
		setName(name);
		setId(id);
		
	}

}
