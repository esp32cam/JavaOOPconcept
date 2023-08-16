//package Week5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divided {
    public static String Divided1(int num) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                list1.add(i);
            }
        }

        String result = "";
        for (int i = 0; i < list1.size(); i++) {
            result += list1.get(i) + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Divided1(num));
    }
}

