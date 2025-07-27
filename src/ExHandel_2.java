
class BalanceExeption extends Exception
{
    public String toString()
    {
        return ("Minimum balance should be 5K... Enter smaller ammount to withdrawl.");
    }
}





public class ExHandel_2
{
    static int withdraw(int ammount) throws BalanceExeption
    {
        int total_balance=10000;
        int remain= total_balance - ammount ;
        if (remain<5000)
            throw new BalanceExeption();
       else {
            System.out.println("Remaining balance is "+remain);
        }
        return 0;
    }
 public static void main(String arg[])
 {
   try{
       withdraw(5000) ;
   }
   catch(BalanceExeption e)
   {
       System.out.println(e);
   }
   finally
   {
       System.out.println("Finally block is executed");
   }
 }
}


