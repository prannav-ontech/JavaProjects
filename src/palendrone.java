
class practice
{
    practice()
    {
        System.out.println("welcome to practice class....");
    }

    public void paln(int number)
    {
        int temp = number;
        int rem,s=0;
        while(number>0)
        {
            rem = number%10;
            s= s*10+rem;
            number = number/10;
        }

       // System.out.println(number);
        if (s==temp) System.out.println("The number is palindrome.");

        else System.out.println("The number is not palindrome.");
    }

}






public class palendrone
{
    public static void main(String ars[] )
    {
       practice p1 = new practice();
       p1.paln(128);
    }
}
