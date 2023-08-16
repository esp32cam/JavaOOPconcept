package week7; 

public class CharArray { 

    public static void main(String[] args) { 

        boolean ax = true; 

        while(ax){ 

        String s = "Hel lo "; 

        String c = s.replace(" ", ""); 

        char[] A = c.toCharArray(); 

        for (char a : A) { 

            System.out.println(a); 

        } 

        ax = false; 

    } 

        System.out.println(); 

        boolean bx = true; 

        while(bx){ 

        String s2 = "Chanakarn Kingkaew "; 

        String c2 = s2.replace(" ", ""); 

        char[] B = c2.toCharArray(); 

        for (char b : B) { 

            System.out.println(b); 

        } 

        bx = false; 

    } 

    } 

} 
