abstract class A
{
    public void m1(){}
    //dummy method
    public void m2(){
        System.out.println("m2 of abstract class A");
    }

}
class B extends A
{
    public void m1()
    {
        System.out.println("m1 override ");
    }

}
class Non_abstract_mwthod
{
    public static void main(String ar[])
    {
        A ao = new B();
        ao.m1();//child class method 
        ao.m2(); // parent class method which is not overridden
    }
}
// we  can create an non abstract methods in the abstract class is valid