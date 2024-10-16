package com.Flyweight.eleven;
public class Main {
    public static void main(String[] args) {
        Circle circle1 = ShapeFactory.getCircle("Red");
        circle1.setX(10);
        circle1.setY(10);
        circle1.setRadius(20);
        circle1.draw();

        Circle circle2 = ShapeFactory.getCircle("Red");
        circle2.setX(15);
        circle2.setY(15);
        circle2.setRadius(25);
        circle2.draw();

        Circle circle3 = ShapeFactory.getCircle("Blue");
        circle3.setX(20);
        circle3.setY(20);
        circle3.setRadius(30);
        circle3.draw();
    }
}
