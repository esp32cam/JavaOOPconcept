package Lab1;

public class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle(5);
        System.out.println(a);
        Circle B = new Circle(10);
        System.out.println(B);
        Circle C = new Circle(15);
        System.out.println(C);
        ResizeableCircle R = new ResizeableCircle(100);
        System.out.println(R);
        R.resize(70);
        System.out.println(R);

    }
}