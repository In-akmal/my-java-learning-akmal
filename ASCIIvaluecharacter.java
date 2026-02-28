import java.util.Scanner;
public class ASCIIvaluecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a char to see acsii value :");
        char ch = sc.next().charAt(0);

        int ASCIIvaluecharacter = (int) ch ;

        System.out.println("given character :"+ch);

        System.out.println("acsii value :"+ASCIIvaluecharacter  );

    }
}
