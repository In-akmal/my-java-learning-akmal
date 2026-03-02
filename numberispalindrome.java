import java.util.Scanner; 
public class numberispalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversed = (reversed * 10)+lastDigit;
            num = num / 10;
        }
    
        if (original == reversed){
            System.out.println("this is the end pa;indorem");
        }else{
            System.out.println("not end .. .. .");

        }
        sc.close();
    }
}
