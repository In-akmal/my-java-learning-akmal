import java.util.Scanner;
public class positive_or_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number to cheack positive or negative : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("it is positive number :"+num);
        }
        else {
            System.out.println("it is negative number :"+num);
        }
        sc.close();
    }
}
