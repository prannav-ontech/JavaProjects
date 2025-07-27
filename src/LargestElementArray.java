class ArrayFunctions
{
    public ArrayFunctions() {
        System.out.println("welcome to array functions....");
    }

    public int Lelement(int []a)
    {
        int largest = a[0];
        int n = a.length;

        for(int i = 0;i<n; i++)
        {
            if(a[i]>largest);   // big 0(n);
            {
                largest =a[i];
            }
        }
        //System.out.println("Largest element is "+largest);
        return largest;
    }



    public int Slargest(int []a)
    {
        int largest= Lelement(a);
        int sLarge= Integer.MIN_VALUE;

        for(int i =0 ;i<a.length;i++)
        {
            if(a[i]>sLarge && a[i]!=largest)
             sLarge = a[i];
        }
        return sLarge;
    }

    public int SSlargest(int []a)
    {
        int largest = a[0];
        int sLarge= Integer.MIN_VALUE;

        for(int i =1 ;i<a.length;i++) // 2 3 4 7  10 10 9
        {
           if(a[i]>largest) {
               sLarge = largest;
               largest = a[i];
           }
           else if (a[i]<largest && a[i] > sLarge)
           {
               sLarge = a[i];
           }

        }
        return sLarge;
    }

    public int SSmallest(int []a)
    {
        int smallest = a[0];
        int Ssmallest = Integer.MAX_VALUE;

        for(int i =1 ;i<a.length;i++)  // 2 3 4 7  10 10 9
        {
           if (a[i]<smallest) {
               Ssmallest = smallest;
               smallest = a[i];
           }

           else if (a[i]!=smallest && a[i] < Ssmallest)
               Ssmallest = a[i];
        }
        return Ssmallest;

    }

    public boolean isSorted(int []a)
    {
        for(int i =1 ;i<a.length;i++){
            if(a[i]>a[i-1])
            {

            }
            else {
                return false;
            }
        }
        return true;

    }
}







public class LargestElementArray {
    public static void main(String[] arg)
    {
        int[] a ={2,3,4,7,9,10,10};

        ArrayFunctions obj = new ArrayFunctions();
        System.out.println( "Second largest number is "+ obj.SSmallest(a));;

        System.out.println( " if "+ obj.isSorted(a));;


    }
}
