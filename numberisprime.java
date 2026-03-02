import java.util.Scanner;
public class numberisprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check it is prime :");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <=1){
            isPrime = false ; 
        }else{
            for(int i= 2; i<=num/2; i++){
                if (num % 1 == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        if(isPrime){
            System.out.println("is a prime number");

        }else{
            System.out.println("not prime");
        }

    }
}
