package com.factory.second;

public class Test {
	
	public static void main(String[] args) {
		
		//to avoid tight coupling in objects factory methode is used to create object
		
		Salary salary = Factory.getSalary("Student");
		
//		int sal=Salary.salary();
		
//		System.out.println(sal);
		
		
	}

}
