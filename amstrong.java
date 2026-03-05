public class amstrong {
    public static void main(String[] args) {
        int result = 0  , original , remainder , number ;
        number = 350;
         original = number; 

         while (original != 0) {
            remainder = original%10;
            result += Math.pow(remainder, 3);
            original/= 10;

         }

         if (result == number) {
            System.out.println("it is amstring number :"+result);
         }else{
            System.out.println("this is not amstrong :"+result);
         }

    }
}
