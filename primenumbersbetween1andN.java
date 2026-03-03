import java.util.Scanner;
public class primenumbersbetween1andN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number ");
        int num = 50;
        for(int i =2; i<num; i++){
            boolean ispime = true ;
           
            for(int j = 2; j<i; j++){
                if (j % i == 0) {
                    ispime = false;
                    break;
                }
            }
            if (ispime) {
                System.out.print(i+"  ");
            }
        }
    }
}
