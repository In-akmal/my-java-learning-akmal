public class findGDC {
    public static void main(String[] args) {
        int a = 48, b = 18; // Example numbers
        
        System.out.print("The GCD of " + a + " and " + b + " is: ");

        while (b != 0) {
            int temp = b;
            b = a % b; // Get the remainder
            a = temp;  // Update 'a' to the old 'b'
        }

        System.out.println(a);
    }
}

