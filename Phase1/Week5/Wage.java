package Week5;
import java.util.Scanner;

public class Wage {
    public static double Wage1(int n, int m) {
        double result = 0;
        if (m > 40) {
            result = ((40*100) + ((m-40)*1.5*n));
        } else {
            result = n * m;
        }
        return result;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Wage1(n, m));
        sc.close();
    }
    
}
