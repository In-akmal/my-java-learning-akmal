import java.util.Scanner;
// 19th problem
public class compound_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Rate (in %): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        System.out.print("Enter number of times interest is compounded per year: ");
        int n = sc.nextInt();

        // covert to decimal

        double r = annualRate /100;
        double amount = principal * Math.pow(1+ ( r/n ) ,n*time);
        double interest = amount - principal;

        System.out.printf("\nTotal Amount after %.1f years: %.2f", time, amount);
        System.out.printf("\nCompound Interest Earned: %.2f\n", interest);
        
        sc.close();
    }
}
