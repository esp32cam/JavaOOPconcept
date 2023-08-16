import java.util.Scanner;
public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Math_tutorial Ex9=new Math_tutorial();
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Fahrenheit: " );
        double f = scanner.nextDouble();
        System.out.println("celsius: " );
        double c = scanner.nextDouble();
        Ex9.getVariable(c,
                        f);
        Ex9.Temperature_Converter();
    }
}
