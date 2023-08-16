package Week6;
import java.util.Scanner;
import java.util.Arrays;

public class Grade64 {
    

    public static void main(String[] args) { 

    Scanner input = new Scanner(System.in); 

            double [] score = new double [11]; 

            System.out.println("pls input score " + score.length +" score"); 

            for (int i = 0 ; i < score.length ; i++) { 

            System.out.print("pls input score at " +(i+1) +" :"); 

                score[i] = input.nextDouble(); 

    } 

    double sum = 0 ;  

            for (int i = 0 ; i < score.length ; i++) { 

    sum += score[i]; 

    } 

            System.out.println("Average " + sum/11); 

            Arrays.sort(score);  // Sorted

            System.out.println("Min "+ score[0]); 

            System.out.println("Max "+ (score[score.length-1])); 

            System.out.println("Score more than mean"); 

            for (int i = 0 ; i < score.length ; i++) { 

                if (sum/11 < score[i]) System.out.println(score[i]); 

            } 

    } 

    } 

