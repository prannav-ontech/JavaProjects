package data_structure;

import java.util.ArrayList;
import java.util.Collections;

public class Print_devisor
{
    public static void main(String ar[])
    {
        int n =36;
        System.out.println("The devisors are:-");

        ArrayList<Integer> divisors = new ArrayList<>();

        for(int i=1;i*i<=n;i++)
        {
            if (n%i==0)
            {
               // System.out.println(i);
                divisors.add(i);
            }
            if(n/i!=i)
            {
                //System.out.println(n/i);
                divisors.add(n/i);
            }
        }
        Collections.sort(divisors);

        for(int x :divisors) System.out.println(x);

    }

}
