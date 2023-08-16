package Week4;
import java.util.Scanner;

public class BMI {
    public static String gradeCalculate(double num) {
        String[] rank = {"obesity", "overweight", "healthy weight", "underweight"};
        int step1 = 5;
        double step2 = 6.5;
        int starting = 30;
        int j = 0;
        while (starting > 0) {
          if (num >= starting) {
            return rank[j];
          } else if (starting < 18.5) {
            return rank[j];
          }
          if (j == 0) {
            starting -= step1;
          } else {
            starting -= step2;

          }
          j += 1;
        }
        return null;
      }
      

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Weight");
    double weight = scanner.nextDouble();
    System.out.println("Heights");
    double height = scanner.nextDouble();
    double BMI = weight/Math.pow(height, 2);
    scanner.close();
    System.out.println(gradeCalculate(BMI));
    }
    
  }

