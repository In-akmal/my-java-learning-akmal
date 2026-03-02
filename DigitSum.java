 import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , digit ,sum = 0 ;
        System.out.println("enter a number :");
         num = sc.nextInt();

        while (num > 0 ) {
            digit = num%10;
            num = num/10;
            sum = sum +digit;
            
        }
        System.out.println("the sum of digit is :"+sum);
    }
}


