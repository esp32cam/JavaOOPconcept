import java.util.Scanner;

public class Leafyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Please Enter START years: "); 
        int n = input.nextInt(); //1704
        System.out.print("Please Enter END years: "); 
        int m = input.nextInt(); //2004
        for (int i = n; i <= m; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + ", ");
            } else {
            }
    }
    input.close();
    }
}

