import java.util.Scanner;
public class vowelorconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a character :");
        char ch = sc.next().charAt(0);
        int number = 0;
        if (  ch == 'a'|| ch == 'e'|| ch == 'i' || ch =='o'|| ch =='u'){
            System.out.println("it is a vowel :"+ch);
        }
         
        
        else {
            System.out.println("this is consonante :"+ch);
        }



    }
}
