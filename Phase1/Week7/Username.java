package week7; 

import java.util.Scanner; 

public class Username { 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter your name: "); 

        String name = sc.nextLine(); 

        System.out.print("Enter your name again: "); 

        String name2 = sc.nextLine(); 

        if (name.equals(name2)) { 

            System.out.println("Success"); 

        } else { 

            System.out.println("Failed! Please re-enter again! "); 

        } 

    } 

} 