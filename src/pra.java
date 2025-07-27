class Check
{
    Check()
    {
        System.out.println("you are in Check class..");
    }


    public boolean isPalendrone(String s)
    {
        String s1=s;
        int length= s.length()-1;
        for (int i=0 ;i < length/2; i++)
        {
            if (s1.charAt(i)==s1.charAt(length-i))
            {
              return true;
            }
            else return false;
        }
        return false;
    }

}


public class pra{
     public static void main(String[] args)
     {
         Check c1 = new Check();
         System.out.println(c1.isPalendrone("000"));

     }
}
