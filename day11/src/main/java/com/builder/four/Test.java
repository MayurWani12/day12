package com.builder.four;

public class Test {
	
	    public static void main(String[] args) {
	        // Building a Car with GPS and Airbags
	        Car sportsCar = new Car.CarBuilder("V8 Engine")
	                            .setSeats(2)
	                            .setGPS(true)
	                            .setAirbags(true)
	                            .build();

	        System.out.println(sportsCar);

	        // Building a Car without GPS and Airbags
	        Car economyCar = new Car.CarBuilder("V4 Engine")
	                            .setSeats(4)
	                            .setGPS(false)
	                            .setAirbags(false)
	                            .build();

	        System.out.println(economyCar);
	    }
	}

	

