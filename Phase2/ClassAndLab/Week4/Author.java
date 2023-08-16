package Phase2.Week1.Week4;

public class Author {

    //instance var
    private String name;
    private String email;
    private char gender;
    public String getBookname;

    //Constructor
    public Author(String name, String email, char gender) {

        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getAuthorName() {
        return name;
    }

    public String getAuthorEmail() {
        return email;
    }
    
    public char getAuthorGender() {
        return gender;
    }

    public Author(Author author) {

        this.name = author.getAuthorName();
        this.email = author.getAuthorEmail();
        this.gender = author.getAuthorGender();
    }

    public String toString() {
        return String.format("Name=%s, Email=%s, Gender=%s",name,email,gender);
    }

}