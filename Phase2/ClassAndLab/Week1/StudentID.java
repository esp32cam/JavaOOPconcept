package Phase2.Week1.Week1;
import java.util.Scanner;

public class StudentID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); //Use nextLong() instead of nextInt()
        if (length(n) == 10) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    public static int length(long num) {
        return String.valueOf(num).length();
    }
}

