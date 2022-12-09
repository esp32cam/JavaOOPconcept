public class Employee{
    // Attribute
    private String id;
    private String name;
    private Double salary;

    // Method
    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(Double salary){
        this.salary=salary;
    }

    public void displayEmployee(){

        System.out.println("ID = "+ this.id);
        System.out.println("Name = "+ this.name);
        System.out.println("Salary = "+ this.salary);
    }

    public String getName(){
        return this.name;
    }
}