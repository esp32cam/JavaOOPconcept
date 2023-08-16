
package Week6;
import java.util.Scanner;

public class GradeCalculation { 

    public static void main(String[] args) { 

    Scanner input = new Scanner (System.in);

    int [] score = new int [5];

    int sum = 0;

    // Input 

    System.out.println("Please enter scores for " + score.length + " students."); 

        for (int i = 0; i < score.length ; i ++) {  

            score [i] = input.nextInt(); 

        } 

    // Process ( Calculation) 

        for (int i = 0; i < score.length ; i ++) {  

            sum = sum+score[i]; 

        }  

        System.out.println("Total score in the class :" + sum); 

    } 

} 