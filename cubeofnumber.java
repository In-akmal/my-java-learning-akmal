import java.util.Scanner;

public class cubeofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find the cube:");
        int num = sc.nextInt();

        int result = num *num*num;
        System.out.println("the cube of that num is :"+result);

        sc.close();
    }
}
