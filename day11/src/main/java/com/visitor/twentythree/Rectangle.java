package com.visitor.twentythree;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this); // Accept the visitor
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}