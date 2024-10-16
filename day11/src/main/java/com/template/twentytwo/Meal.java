package com.template.twentytwo;

public abstract class Meal {
    
    public final void prepareMeal() {
        prepareIngredients();
        cook();
        serve();
    }

    protected abstract void prepareIngredients(); // Abstract step
    protected abstract void cook(); // Abstract step

    private void serve() { // Concrete step
        System.out.println("Serving the meal.");
    }
}
