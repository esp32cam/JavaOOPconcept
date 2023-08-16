package Phase2.Week1.Week4;

public class Book {

    private Author author;
    private String bookname;
    private double price;
    private int qty = 0;

    public Book (String bookname, Author author, double price) {

        this.bookname = bookname;
        this.price = price;
        this.author = author;
    
    }

    public Book(Author author, String bookname, double price, int qty) {
        this.author = author;
        this.bookname = bookname;
        this.price = price;
        this.qty = qty;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookname() {
        return bookname;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public String toString() {
        return String.format("Book[name=%s, %s,price=%.2f,qty=%d",bookname,author,price,qty);
    }
}
