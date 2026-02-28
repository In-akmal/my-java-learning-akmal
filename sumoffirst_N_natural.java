import java.util.Scanner;
public class sumoffirst_N_natural {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a to find :");
        int n = sc.nextInt();
        sc.close();
        int evensum = 0;
        int oddsum = 0;
        for(int i = 1; i <= n ; i++){

            if (i % 2 == 0) {
                evensum+=i;
            }
        else {
            oddsum+=i;
        }
    }

    System.out.println("sum of even natural numbers :"+evensum);
    System.out.println("sum of odd natural numers :"+oddsum);

 }

}



