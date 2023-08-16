package Phase2.Week1.Week5;

// Circle.java
public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159265359;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract methods from the Shape class
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
