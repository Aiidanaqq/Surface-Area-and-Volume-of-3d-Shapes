package org.example;

// Cube.java
public class Cube implements Shape3DInterface {
    private double sideLength;

    // Constructor with random side length
    public Cube() {
        this.sideLength = 1 + (Math.random() * 9);  // Random side length between 1 and 10
    }

    // Surface area of a cube: 6a²
    @Override
    public double surfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    // Volume of a cube: a³
    @Override
    public double volume() {
        return Math.pow(sideLength, 3);
    }

    // Name of the shape
    public String getName() {
        return "Cube";
    }
}
