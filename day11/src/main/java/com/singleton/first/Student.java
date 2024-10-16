package com.singleton.first;

public class Student {
//create student as private and ststic object
	private static Student student;
	
	//for creating singleton object create constructor as private 
	 private Student() {
		
	}
	 
	 //craete method to create object
	 public static Student getStudent() {
		 
		 if(student==null) {
			 
			student= new Student();
		 }
		 
		 return student;
		 
	 }
	 
	 
	 
	 
	
	

}
