import java.util.Scanner;

public class taxi_fare_function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x ");
        double x = scanner.nextDouble();
        double y = calculateTaxiFare(x);
        System.out.println("The taxi fare for " + x + " is " + y);
        scanner.close();
    }

    public static double calculateTaxiFare(double x) {
        double y = 0;
        if (x >= 0 && x <= 1) {
            y = 35;
        } else if (x > 1 && x <= 12) {
            y = 5 * x + 30;
        } else if (x > 12 && x <= 20) {
            y = 5.5 * x + 24;
        } else if (x > 20 && x <= 40) {
            y = 6 * x + 14;
        } else if (x > 40 && x <= 60) {
            y = 6.5 * x - 6;
        } else if (x > 60 && x <= 80) {
            y = 7.5 * x - 66;
        } else if (x > 80) {
            y = 8.5 * x - 146;
        }
        return y;
    }
}
