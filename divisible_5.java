import java.util.Scanner;
public class divisible_5 {

    public static void divisibleBy3(int num){
        if (num % 3 == 0){
            System.out.println("it is divisible by 3:"+num);
        }
        else {
            System.out.println("it is not ");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number to cheack if it is divisible by 5 :");
        int num = sc.nextInt();

        if (num % 5 == 0){
            System.out.println("the number is divisible by 5 :"+num);
        }
        else{
            System.out.println("it is not divisible by 5 :"+num);

        }
        divisibleBy3(9);
        sc.close();
    }
}
