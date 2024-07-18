package com.assignment;

public class UserMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cut = new Customer("faizal",567,"trainee");
		Employyee e = new Employyee("tom",789,"hr");
		admin ad = new admin("ram",909,"manager");
		
		cut.getdetails();
		e.getdetails();
		ad.getdetails();
		
		cut.setdetails("Mr.faizal ", 678);
		e.setdetails("gyan", 654);
		ad.setdetails("shyam", 87);
		
		cut.getdetails();
		e.getdetails();
		ad.getdetails();
		
	}

}
