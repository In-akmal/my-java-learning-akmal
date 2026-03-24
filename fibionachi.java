public class fibionachi {
    public static void main(String[] args) {
       
        int n = 10; // Number of terms to generate
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series of " + n + " terms:");

        for(int i = 1; i<= n; i++){
            System.out.print(firstTerm + ", ");

            int nextterm  = firstTerm + secondTerm;

            firstTerm = secondTerm;
            secondTerm = nextterm;
        }

      
    }
}









//         for (int i = 1; i <= n; ++i) {
//             System.out.print(firstTerm + ", ");

//             // Compute the next term
//             int nextTerm = firstTerm + secondTerm;

//             // Update terms for the next iteration
//             firstTerm = secondTerm;
//             secondTerm = nextTerm;
//         }