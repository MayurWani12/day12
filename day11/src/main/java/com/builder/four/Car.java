package com.builder.four;
//Car.java
public class Car {
 private String engine;
 private int seats;
 private boolean hasGPS;
 private boolean hasAirbags;

 // Private constructor to enforce object creation via the Builder
 private Car(CarBuilder builder) {
     this.engine = builder.engine;
     this.seats = builder.seats;
     this.hasGPS = builder.hasGPS;
     this.hasAirbags = builder.hasAirbags;
 }

 // Getters
 public String getEngine() { return engine; }
 public int getSeats() { return seats; }
 public boolean hasGPS() { return hasGPS; }
 public boolean hasAirbags() { return hasAirbags; }

 @Override
 public String toString() {
     return "Car [engine=" + engine + ", seats=" + seats + ", hasGPS=" + hasGPS + ", hasAirbags=" + hasAirbags + "]";
 }

 // Static Builder Class
 public static class CarBuilder {
     private String engine;
     private int seats;
     private boolean hasGPS;
     private boolean hasAirbags;

     public CarBuilder(String engine) {
         this.engine = engine; // mandatory attribute
     }

     public CarBuilder setSeats(int seats) {
         this.seats = seats;
         return this;
     }

     public CarBuilder setGPS(boolean hasGPS) {
         this.hasGPS = hasGPS;
         return this;
     }

     public CarBuilder setAirbags(boolean hasAirbags) {
         this.hasAirbags = hasAirbags;
         return this;
     }

     public Car build() {
         return new Car(this);
     }
 }
}
