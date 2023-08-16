package Lab1;

public class Circle implements GeometricObject {

    protected double radius = 1.0;
    @Override
    public double getarea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double getperimeters() {
        return 2*Math.PI*radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public String toString() {
        return "A Circle with radius=" + radius + " Perimeters=" + getperimeters() +" Area=" + getarea();
    }
}
