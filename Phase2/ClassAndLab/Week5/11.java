package Phase2.Week1.Week5;

public abstract class Shape {
 
   protected abstract double getArea(double length);
   protected abstract double getPerimeter(double length);
}
 
public class Square extends Shape {
 
   public double getArea(double side){
      return side * side;
   }
   public double getPerimeter(double side){
      return side * 4;
   }
   public String getColor(){
      return "blue";
   }
}
 
public class TestProgram {
 
   public static void main(String[] args){
      Square s = new Square();
      System.out.print(s.getArea(3));
      System.out.print("," + s.getPerimeter(6));
      System.out.print("," + s.getColor());
   }
}

