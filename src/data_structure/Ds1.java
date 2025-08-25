package data_structure;


public class Ds1
{
    public static void main (String args [])
    {
      int i =7654;
//        System.out.println("Number of digit is:-"+ ((int)Math.log10(i)+1));       (To find number of digits...)
       int count=0;

       while(i>0)
       {
           int n =i%10;
           count++;
           i=i/10;
       }
        System.out.println("Number of digits are:-"+ count);





    }
}
