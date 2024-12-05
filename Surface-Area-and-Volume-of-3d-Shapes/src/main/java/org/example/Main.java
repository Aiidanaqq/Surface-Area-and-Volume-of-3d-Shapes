package org.example;
// Shape3DTest.java
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a list to hold random Shape3DInterface objects
        List<Shape3DInterface> shapes = new ArrayList<>();
        Random rand = new Random();

        // Generate 10 random shapes (Sphere, Cylinder, or Cube)
        for (int i = 0; i < 10; i++) {
            int shapeType = rand.nextInt(3);  // Random number between 0 and 2
            switch (shapeType) {
                case 0:
                    shapes.add(new Sphere());
                    break;
                case 1:
                    shapes.add(new Cylinder());
                    break;
                case 2:
                    shapes.add(new Cube());
                    break;
            }
        }

        // Output information about each shape
        for (Shape3DInterface shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.printf("Surface Area: %.2f\n", shape.surfaceArea());
            System.out.printf("Volume: %.2f\n\n", shape.volume());
        }
    }
}
