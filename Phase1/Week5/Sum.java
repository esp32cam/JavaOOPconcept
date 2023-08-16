package Week5;
import java.util.Scanner;

public class Sum {
    public static double Sum(int num) {
        double result = 0;
        result = (num * 50.5); 
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Sum(num));
        sc.close();
    }
}