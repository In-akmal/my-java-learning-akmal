import java.util.Scanner;

public class squareofnumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find the squre :");
        int num = sc.nextInt();

        int result = num *num;
        System.out.println("the squre of that num is :"+result);

        sc.close();
    }
}
