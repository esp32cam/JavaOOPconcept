package Lab1;

public class ResizeableCircle extends Circle implements Resizable {

    public ResizeableCircle(double radius) {
        super(radius);
    }
    

    @Override
    public void resize(int percent) {
        super.radius *= percent * 0.01;
        //return percent;
    }
}