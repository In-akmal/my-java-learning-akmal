import java.util.Scanner;
//18th problem
public class simpleinterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter principle:");
        double principle = sc.nextDouble();

        System.out.println("enter rate :");
        double rate = sc.nextDouble();

        System.out.println("enter time :");
        double time = sc.nextDouble();

        double intrest = (principle*rate*time)/100;
        double totalAmount = principle+intrest;

        System.out.println("the simple interest is : "+intrest);
        System.out.println("the principle and interest is : "+totalAmount);

    }
}
