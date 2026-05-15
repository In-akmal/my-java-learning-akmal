class abstract_15{
    abstract static class shape{
        abstract public double perimeter();
        abstract public double  area();
    }
     static class rectangle extends shape{
            
             public double length;
        public double breadth;
    
        public double area(){
            return length*breadth;
        }
        public double perimeter(){
            return 2*(length+breadth);
        }
         
     

    }

    public static void main(String[] args) {
     rectangle r = new rectangle();
     r.length=10.5;
     r.breadth=5;
     System.out.println(r.area());
    }
}

