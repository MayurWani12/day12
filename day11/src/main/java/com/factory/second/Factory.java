package com.factory.second;

public class Factory {


	

	public static Salary getSalary(String saltype) {
		
	
		if(saltype.trim().equalsIgnoreCase("Student")) {
			
			return new Student();
		}else if(saltype.trim().equalsIgnoreCase("Employee")) {
			
			return new Employee();
		
		}
		else {
		
		return null;
		
		}
		
	}
	
	
}
