package com.Flyweight.eleven;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating new Circle of color: " + color);
        }
        return circle;
    }
}
