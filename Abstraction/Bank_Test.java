interface RBI
{
    void Atm();
    void homeloan();
    void rateofInterest();

}
class PNB implements RBI
{
    public void Atm(){
    System.out.println("atm provided");
    }
    public void homeloan()
    {
    System.out.println("home loanes");    
    }
    public void rateofInterest(){
        
    }
    

}