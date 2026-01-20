package com.example;

class encap1 {

	public static void main(String[] args) {
		Encap s1 = new Encap();
		
		
		s1.roll = 101;
		s1.name = "Devika";
		s1.age = 23;
		s1.phone = 9048146003L;
		s1.marks = 90;
		s1.percentage = 9.0;
		
		
		s1.displayInfo();
		
		Encap s2 = new Encap();
		
		s2.roll = 102;
		s2.name = "Gopika";
		s2.age = 23;
		s2.phone = 9567083665L;
		s2.marks = 80;
		s2.percentage = 8.0;
		s2.displayInfo();
		
		


	}

}
