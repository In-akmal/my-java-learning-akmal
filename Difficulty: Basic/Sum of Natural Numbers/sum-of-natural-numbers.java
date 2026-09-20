import java.util.Scanner;
import java.util.Arrays;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read the input integer n
        int n = sc.nextInt();

        // 2. Compute the sum using the O(1) mathematical formula
        int sum = (n * (n + 1)) / 2;

        // 3. Print the result
        System.out.println(sum);

        sc.close(); // Good practice to close the scanner
    }
}
