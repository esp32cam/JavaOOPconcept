package Week5;
import java.util.Scanner;

public class MultiplicationTable {
    public static String MULTIPLETable(int num) {
        String result = "";
        for (int i = 1; i <= 12; i++) {
            int res = (i * num);
            result += num + "*" + i + "=" + res + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(MULTIPLETable(num));
        sc.close();
    }
}





