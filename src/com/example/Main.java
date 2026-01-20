package com.example;

class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.roll = 11;
		s1.name = "Ajay";
		s1.age = 23;
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.age);
		s1.study();
		s1.prepareInterview();
		
		// TODO Auto-generated method stub

	}

}
