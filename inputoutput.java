import java.util.Scanner;
public class inputoutput {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

         System.out.print("enter a number :");
         int num = scanner.nextInt();

         System.out.print("enter name :");
         scanner.nextLine();
         String name = scanner.nextLine();


         System.out.println("your name is :" +name + "\nyour number is:"+num);

         scanner.close();

    }
}