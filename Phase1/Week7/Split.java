package week7; 

public class Split { 

    public static void main(String[] args) { 

        String s = "080-111-1111"; 

        String[] words = s.split("-"); 

        for (String w : words) { 

            System.out.print(w); 

        } 

        System.out.println(); 

        String a = "02-855-0000 "; 

        String[] words2 = a.split("-"); 

        for (String b : words2) { 

            System.out.print(b); 

        } 

    } 

} 
    

