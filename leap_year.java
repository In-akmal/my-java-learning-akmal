import java.util.Scanner;
//20 th problem
public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter year :");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            System.out.println("it is a leap year "+year);
            
        }else {
            System.out.println("it is not a leap year :"+year);

        }
        
        sc.close();

    }
}
