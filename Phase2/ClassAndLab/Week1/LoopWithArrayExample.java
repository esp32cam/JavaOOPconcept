package Phase2.Week1.Week1;

public class LoopWithArrayExample {
    public static void main(String[] args) {
        int[] numbers = {111, 222, 333, 444, 555};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The summary of the array numbers is: " + sum);
    }
}
