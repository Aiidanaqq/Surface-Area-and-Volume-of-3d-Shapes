package org.example;

// Cylinder.java
public class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;

    // Constructor with random radius and height
    public Cylinder() {
        this.radius = 1 + (Math.random() * 9);  // Random radius between 1 and 10
        this.height = 5 + (Math.random() * 15);  // Random height between 5 and 20
    }

    // Surface area of a cylinder: 2πr(r + h)
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Volume of a cylinder: πr²h
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Name of the shape
    public String getName() {
        return "Cylinder";
    }
}
