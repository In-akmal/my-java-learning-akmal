import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number :");
        int num = sc.nextInt();
        
        if (num % 2 == 0){
            System.out.println("it is even ");
        }
        else {
            System.out.println("it is odd");

        }

        sc.close();
        
    }
}
