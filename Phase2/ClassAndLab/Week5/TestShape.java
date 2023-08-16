package Phase2.Week1.Week5;

// TestShape.java
public class TestShape {
    public static void main(String[] args) {
        // Create a Circle instance
        double circleRadius = 5.0;
        Circle circle = new Circle(circleRadius);

        // Create a Rectangle instance
        double rectangleLength = 4.0;
        double rectangleWidth = 6.0;
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);

        // Print Circle details
        System.out.println("Circle:");
        System.out.println("- Radius: " + circleRadius);
        System.out.println("- Area: " + circle.getArea());
        System.out.println("- Perimeter: " + circle.getPerimeter());
        System.out.println();

        // Print Rectangle details
        System.out.println("Rectangle:");
        System.out.println("- Length: " + rectangleLength);
        System.out.println("- Width: " + rectangleWidth);
        System.out.println("- Area: " + rectangle.getArea());
        System.out.println("- Perimeter: " + rectangle.getPerimeter());
    }
}

