abstract class Bank
{   
    abstract void RateofInterset();
    //abstract method
    void card ()
    {
        System.out.println("debit card");
        System.out.println("credit card");
    }//non abstract
}
class SBI extends Bank 
{
    public void RateofInterset (){
        System.out.println("implimenting abstact method of bank");
        System.out.println("interest 7 %");

    }
}
class TestAbstract 
{
  public static void main(String args [])
  {
    SBI sbi_obj = new SBI();
    sbi_obj.RateofInterset();
    sbi_obj.card();
  }  
}
