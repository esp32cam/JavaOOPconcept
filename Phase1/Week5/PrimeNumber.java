public class PrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
            // check if the number is divisible by any number between 2 and n/2
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    
        // print the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
