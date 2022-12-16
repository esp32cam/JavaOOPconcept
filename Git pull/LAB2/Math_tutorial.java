public class Math_tutorial {
    // Attribute
    private Double A;
    private Double B;
    private Double C;
    private Double D;
    private Double E;
    private Double F;
    private Double G;
    private Double H;

    // Method
    public void getVariable(Double A,
                         Double B, 
                         Double C, 
                         Double D, 
                         Double E, 
                         Double F, 
                         Double G, 
                         Double H){
        this.A=A;
        this.B=B;
        this.C=C;
        this.D=D;
        this.E=E;
        this.F=F;
        this.G=G;
        this.H=H;
    }

    public void FormulaMethod(){
        double Formula1 = A + B * C / (D * E) - (F + G) - H;
        System.out.println("A + B * C / (D * E) – (F + G) – H =?"+ Formula1);
    }
}
