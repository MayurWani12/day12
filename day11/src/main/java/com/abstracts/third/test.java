package com.abstracts.third;

public class test {
	
	    private static ButtonFactory configureFactory(String theme) {
	        if (theme.equalsIgnoreCase("Light")) {
	            return new LightButtonFactory();
	        } else if (theme.equalsIgnoreCase("Dark")) {
	            return new DarkButtonFactory();
	        } else {
	            throw new IllegalArgumentException("Unknown theme: " + theme);
	        }
	    }

	    public static void main(String[] args) {
	    	
	        ButtonFactory factory = configureFactory("Light");

	      
	        Button button = factory.createButton();

	      
	        button.paint();  
	    }
	}


