package Phase2.Week1.Week3;

public class Time2Test {
    public static void main(String[] args) {
        
        Time2 t1 = new Time2(1,2,3);
        System.out.println(t1.toUniversalString());
        Time2 t2 = new Time2(2);
        System.out.println(t2.toUniversalString());
        Time2 t3 = new Time2(132);
        System.out.println(t3.toUniversalString());
        Time2 t4 = new Time2(13,12,11);
        System.out.println(t4.toUniversalString());
        Time2 t5 = new Time2(77,77);
        System.out.println(t5.toUniversalString());
    }
}
