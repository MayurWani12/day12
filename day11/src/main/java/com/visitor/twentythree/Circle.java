package com.visitor.twentythree;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this); // Accept the visitor
    }

    public double getRadius() {
        return radius;
    }
}