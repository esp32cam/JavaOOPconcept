package Phase2.Week1.Week3;

public class Date {//23.6.2566

    //Instance Variable
    private int day;
    private int month;
    private int year;

    public void setDate(int day, int month, int year) {
        
        this.day = (day > 0 && day < 32) ? day:0;
        if (month > 0 && month < 13) this.month=month;
        if (year >= 1900 && year <=9999) this.year = year;

    
    }

    public String toString() {

        return this.day + "/" + this.month + "/" + this.year; 
    }
}

class DateTest {

    public static void main(String [] args) {
        
        Date today = new Date();
        today.setDate(23,6,2023);
        System.out.println(today);

    }
}
