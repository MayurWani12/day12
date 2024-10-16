package com.singleton.first;

public class Test {
	
	public static void main(String[] args) {
		
	Student student1=Student.getStudent();
			
	System.out.println(student1.hashCode());		
	
	
	Student student2=Student.getStudent();
	System.out.println(student2.hashCode());
	
	//both have the same object
	
		}
		
		
	}

