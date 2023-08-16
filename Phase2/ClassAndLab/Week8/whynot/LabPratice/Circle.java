
public class Circle implements Geo {

    protected double radius = 1.0;

    @Override
    public double getarea() {
        return Math.PI*Math.pow(radius, 2);
    }
}