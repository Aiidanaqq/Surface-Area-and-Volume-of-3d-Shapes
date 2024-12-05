# Java Polymorphism with 3D Shapes

## Project Description

This project demonstrates **polymorphism** in Java by creating an interface for 3D shapes and implementing it in different classes representing various shapes. Each shape (Sphere, Cylinder, Cube) can calculate its own **surface area** and **volume** based on its specific dimensions and formulas.

The program creates **random objects** of different 3D shapes and calculates their surface area and volume. It then displays the name, surface area, and volume of each shape.

### How Polymorphism is Used

- **Polymorphism** is demonstrated through the `Shape3DInterface` which defines common methods (`surfaceArea()` and `volume()`) that are implemented by different shape classes (`Sphere`, `Cylinder`, `Cube`).
- Each shape class provides its own specific implementation of the `surfaceArea()` and `volume()` methods, but they all share the same interface. This allows us to treat all shapes uniformly and access their properties through the `Shape3DInterface`.
  
### Shapes Implemented

- **Sphere**: Calculates the surface area and volume of a sphere using the following formulas:
  - Surface Area: \( 4\pi r^2 \)
  - Volume: \( \frac{4}{3}\pi r^3 \)
  
- **Cylinder**: Calculates the surface area and volume of a cylinder using the following formulas:
  - Surface Area: \( 2\pi r (r + h) \)
  - Volume: \( \pi r^2 h \)
  
- **Cube**: Calculates the surface area and volume of a cube using the following formulas:
  - Surface Area: \( 6a^2 \)
  - Volume: \( a^3 \)

## How to Use the Program

### Prerequisites

- Java Development Kit (JDK) 8 or higher.

### Instructions

1. **Download the Code:**
   - Clone or download the repository to your local machine.

2. **Compile the Java Files:**
   - Open a terminal/command prompt and navigate to the directory containing the `.java` files.
   - Compile the Java files using the following commands:
     ```bash
     javac Shape3DInterface.java
     javac Sphere.java
     javac Cylinder.java
     javac Cube.java
     javac Shape3DTest.java
     ```

3. **Run the Program:**
   - Run the `Shape3DTest` class to see the program output:
     ```bash
     java Shape3DTest
     ```

4. **Output:**
   - The program will randomly generate 10 3D shapes and display their surface area and volume.

### Example Output

```plaintext
Shape: Sphere
Surface Area: 452.39
Volume: 565.49

Shape: Cube
Surface Area: 216.00
Volume: 1000.00

Shape: Cylinder
Surface Area: 452.39
Volume: 565.49

Shape: Cube
Surface Area: 54.00
Volume: 216.00

Shape: Cylinder
Surface Area: 452.39
Volume: 565.49

Shape: Sphere
Surface Area: 452.39
Volume: 565.49

Shape: Sphere
Surface Area: 452.39
Volume: 565.49

Shape: Cube
Surface Area: 216.00
Volume: 1000.00

Shape: Cylinder
Surface Area: 452.39
Volume: 565.49

Shape: Cube
Surface Area: 216.00
Volume: 1000.00
