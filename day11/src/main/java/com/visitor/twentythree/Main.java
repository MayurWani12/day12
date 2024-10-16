package com.visitor.twentythree;
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6) };

        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("Total Area: " + areaCalculator.getTotalArea());
    }
}
