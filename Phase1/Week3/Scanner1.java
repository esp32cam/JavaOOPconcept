package Week3;
import java.util.Scanner; 

public class Scanner1 { 

    public static void main(String args[]) { 

    Scanner input = new Scanner(System.in); 

    String text = input.nextLine(); //// นำข้อมูลเข้ามาทั้งบรรทัด 

    String text2 = input.next(); /////// นำข้อมูลเข้ามาเพียง Token เดียว 

    int d = input.nextInt(); 

    double e = input.nextDouble(); 

    long f = input.nextLong(); 

    boolean isHungry = input.nextBoolean(); 

    } 

} 
