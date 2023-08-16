package Week3;
import java.util.Scanner;

public class GradeCalculator {
    public static String gradeCalculate(double num) {
        String[] rank = {"A", "B+", "B", "C+", "C", "D+", "D", "F"};
        int step = 5;
        int starting = 90;
        int j = 0;
        while (starting > 0) {
          if (num >= starting) {
            return rank[j];
          } else if (starting < 60) {
            return rank[j];
          }
          starting -= step;
          j += 1;
        }
        return null;
      }
      

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int iterate = 5;
    int numCount = 0;
    while (iterate > 0) {
      System.out.print("Enter a grade: ");
      int num = scanner.nextInt();
      numCount += num;
      iterate -= 1;
    }
    scanner.close();

    double result = Math.ceil(numCount / 5);
    System.out.println("The student's average grade is " + result);
    System.out.println("The student's letter grade is " + gradeCalculate(result));
  }
}
