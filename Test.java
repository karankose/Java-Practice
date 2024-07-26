class Ex1{
    public void m1()
    {
   try
   { 
        int a =4 /0;
        System.out.println(a);
   }
    catch(Exception o ){
    System.out.println("no");
   }
    System.out.println("yes");
}
    static{
        System.out.println("static block");
    }
}
class Test{
    public static void main(String[] args) {
        Ex1 obj = new Ex1();    
        obj.m1();
    }
}