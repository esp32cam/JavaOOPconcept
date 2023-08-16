package Phase2.Week1.Week1;
import java.util.Scanner;

public class IntDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n1 = sc.nextLong();
        if (n > n1) {
            System.out.printf("%d %d", n, n1);
        } else {
            System.out.printf("%d %d", n1, n);
        }
    }
}

