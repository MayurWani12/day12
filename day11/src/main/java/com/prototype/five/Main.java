package com.prototype.five;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===============");
		
		Netwokconnection netwokconnection=new Netwokconnection();
		netwokconnection.setIp("1234.4.5.56.65");
		netwokconnection.loadveryimportantdata();;
		
		System.out.println(netwokconnection);
		
		
		try {
			
			Netwokconnection netwokconnection2=(Netwokconnection) netwokconnection.clone();
			System.out.println(netwokconnection2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}
	
	

}
