package org.example;

// Sphere.java
public class Sphere implements Shape3DInterface {
    private double radius;

    // Constructor with random radius
    public Sphere() {
        this.radius = 1 + (Math.random() * 9);  // Random radius between 1 and 10
    }

    // Surface area of a sphere: 4πr²
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Volume of a sphere: (4/3)πr³
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Name of the shape
    public String getName() {
        return "Sphere";
    }
}
