package com.template.twentytwo;

public  class Main {
    public static void main(String[] args) {
        Meal vMeal = new VMeal();
        vMeal.prepareMeal(); 

        System.out.println();

        Meal nMeal = new NMeal();
        nMeal.prepareMeal(); 
    }
}
