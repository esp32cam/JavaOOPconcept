package Week4;
import java.util.Scanner;

public class SwitchCase { 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();

        switch (month) {
            case "January":
                System.out.println("It's January!");
                break;
            case "February":
                System.out.println("It's February!");
                break;
            case "March":
                System.out.println("It's March!");
                break;
            // Add cases for the remaining months of the year
            default:
                System.out.println("Invalid month.");
                break;
    }

}

}