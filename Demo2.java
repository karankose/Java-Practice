class ex2{
          public void m1(String  a)//throws NullPointerException
          {
            System.out.println("h");
             System.out.println(a);
          }
}

public class Demo2 {
    public static void main(String[] args) {
        ex2 obj = new ex2();
      //  try {
            obj.m1("null pointer");
            
      //  } catch (Exception e) {
            
        }
    }

