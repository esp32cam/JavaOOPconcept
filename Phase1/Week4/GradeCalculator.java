package Week4;
import java.util.Scanner;

public class GradeCalculator {
    public static String gradeCalculate(int num) {
        String[] rank = {"A", "B", "C", "D", "F"};
        int step1 = 9;
        int step2 = 16;
        int starting = 100;
        int j = -1;
        while (starting > 0) {
          if (num >= starting) {
            return rank[j];
          } else if (starting < 40) {
            return rank[j];
          }

          if (j == 0) {
            starting -= step2;
          } else if (j == 4) {
            return rank[j];
          } else {
            starting -= step1;
          }
          j += 1;
        }
        return null;
      }
      

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int score = scanner.nextInt();
    scanner.close();
    System.out.println(gradeCalculate(score));
  }
}
