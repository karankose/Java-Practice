abstract class RBI
{
    abstract void loan ();
    abstract void cards();
    abstract void transaction_limit();

}
class PNB extends RBI
{   
    static{
        System.out.println("welcome to PNB");
    }
    public void overdraft ()
    {
        System.out.println("over draft facility");
    }
    public void loan ()
    {
        System.out.println("home loan");
        System.out.println("car loan");
        System.out.println("gold loan");
    }
    public void cards()
    {
        System.out.println("debit and credit card");
    }
    public void transaction_limit()
    {
        System.out.println("only 4 without charges");
    }
}

class BOI extends RBI
{   
    static{
        System.out.println("welcome to BOI");
    }
    public void loan ()
    {
        System.out.println("car loan");
        System.out.println("gold loan");
    }
    public void cards()
    {
        System.out.println("debit  card");
    }
    public void transaction_limit()
    {
        System.out.println("only 6 without charges");
    }
}


public class Abstract {
    public static void main (String ar[])
    {
        PNB obj = new PNB();
        System.out.println("____________________________________________");
        obj.loan();
        obj.cards();
        obj.transaction_limit();
        System.out.println("____________________________________________");

        BOI obj5 = new BOI();
        System.out.println("____________________________________________");
        obj5.loan();
        obj5.cards();
        obj5.transaction_limit();
        System.out.println("____________________________________________");
    }
}
