class inherenence_15{
    class car{
        public String car;
        
        public void brand(){
            System.out.println("different brands");
        }
        public void rooftop(){
            System.out.println("only luxary cars");
        }
   
        
    }

    public class Luxarycar extends car{
            public String luxary;
            @Override
            public void rooftop() {
                // TODO Auto-generated method stub
                super.rooftop();
            }
            public void confort(){
                System.out.println("full high range");
            }
            public void price(){
                System.out.println("high range");
            }

    }

    public static void main(String[] args) {
        inherenence_15 outer = new inherenence_15();
        car cs = outer.new car();
        car c = outer.new Luxarycar();
        Luxarycar lc = outer.new Luxarycar();
        cs.rooftop();
        cs.brand();
        c.rooftop();
        c.brand();
        lc.confort();
        lc.price();
    }
}