import java.util.Scanner;
public class squarerootofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find the squre :");
        int num = sc.nextInt();

        double result = Math.sqrt(num) ;
        System.out.println("the squre of that num is :"+result);

        sc.close();
    }
}
