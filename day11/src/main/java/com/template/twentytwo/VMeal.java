package com.template.twentytwo;

public class VMeal extends Meal {
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing vegetables and grains.");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking vegetables.");
    }
}

class NMeal extends Meal {
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing meat and spices.");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking meat.");
    }
}
