import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to generate a mulitplication tsble :");

        int n = sc.nextInt();
        int res = 1;
        for(int i = 1; i<=10; i++){
            res = n*i;
            System.out.println(+n+"X"+i+"="+res);
        }
    }
}
