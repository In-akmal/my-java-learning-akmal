class Solution {
    public static int nextPrime(int n) {
        // Start checking from the very next integer
        int next = n + 1;

        // Keep incrementing until we find a prime number
        while (!isPrime(next)) {
            next++;
        }

        return next;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false; // Quickly eliminate even numbers

        // Check odd divisors up to the square root of num
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

