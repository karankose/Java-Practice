class D1{
        public static void validate (int age)throws ArithmeticException{
            try {
            if (age < 18 )
            System.out.println("age must be above 18");
           }   
             catch (Exception e) {
                System.out.println("age should be above 18 ");

            }System.out.println("one");
            
        }
        public static void m1(int age)throws Exception{
            if (age < 18){
                System.out.println("age  must 18.........");
                throw new IllegalArgumentException("age must");
            }System.out.println("age :::: "+age);
        }
    }

public class Demo {
    public static void main(String[] args) {
        D1.validate(45);
        try {
            D1.m1(12);
            
        } catch (Exception e) {
            System.out.println("illegal age");
        }
System.out.println("testing to continue.....");
    }
    
}
