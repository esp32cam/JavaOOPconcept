public class Main {
    public static void main(String []args){ 
        Employee e1=new Employee(); // Create object
        e1.setId("1"); // Assign
        e1.setName("Pongsapak");
        e1.setSalary(60000.0);
        //e1.displayEmployee();
        System.out.println(""+e1.getName());

        Employee e2=new Employee(); // Create object
        e2.setId("1"); // Assign
        e2.setName("Pongsakorn");
        e2.setSalary(65000.0);
        //e2.displayEmployee();
        System.out.println(""+e2.getName());
    }

}

