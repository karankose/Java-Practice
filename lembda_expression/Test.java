
@FunctionalInterface
interface A
{
    void rateofInterest();
    default void withdraw()
    {
        System.out.println("withdraw successful");
    }

}
class Test
{
    public static void main(String ar [])
    {
        A ref = ()->System.out.println("rate of interest 9 %");
        ref.rateofInterest();
        ref.withdraw();
    }
}