package com.decorator.nine;

public class Main {
	
	    public static void main(String[] args) {
	        Employee employee = new Bemp();

	        employee = new Manager(employee);
	        System.out.println("Role: " + employee.getRole());

	       
	        employee = new Team(employee);
	        System.out.println("Role: " + employee.getRole());
	    }
	

}
