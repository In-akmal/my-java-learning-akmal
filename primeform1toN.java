public class primeform1toN {
    public static void main(String[] args) {
        int n = 50; // The limit up to which you want primes
        
        System.out.println("Prime numbers between 1 and " + n + ":");

        // Loop through every number from 2 to N
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // Check if 'i' is divisible by any number smaller than it
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // Found a factor, so it's not prime
                    break;
                }
            }

            // If no factors were found, print the number
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}



