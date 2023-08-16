package Week3;
import java.util.Scanner;

public class IfElse { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("The number is positive.");
        } else if (n < 0) {
            System.out.println("The number is negative.");
        } else { 
            System.out.println("The number is zero.");

        }
        }
        
    }


