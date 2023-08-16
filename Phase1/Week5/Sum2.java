package Week5;
import java.util.Scanner;

public class Sum2 {
    public static double Sum2(int num, int num1) {
        int result = num1 - (num1 - num);
        int result2 = (result+1) * 3; 
        return result2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        System.out.println(Sum2(num, num1));
        sc.close();
    }
}