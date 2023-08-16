package Phase2.Week1.Week4;

public class BookTest {
    
    public static void main (String [] args) {
        Author a = new Author("CK","oakabc@gmail.com",'M');
        // System.out.println(a);
        Book b = new Book ("My name is CK", a, 100);
        System.out.println(b);
    }
}