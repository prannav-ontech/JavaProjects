package data_structure;

import java.util.Scanner;

public class RevArr_rec2
{
    static int[] arr = new int[6];


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
         fun(0,arr,6);
        System.out.println("    ");
        for(int x:arr)
        {
            System.out.println("      " +x);
        }
    }


    /*   arr.length = n (in this case, 6)

Last index of the array = n - 1

So, if you are at index i from the left, the corresponding index from the right is:
   right index=(n−1)−i=n−i−1.....

we need the mirror element of i, which changes as i increases — that’s why we use n - i - 1


   So, n-i-1 is used because it calculates the index from the right end that corresponds to index i from the left.
*/


    static void fun( int i ,int[] arr, int n)
    {
        if (i>=n/2) return ;
        else{
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-1-i] = temp;
            fun(i+1,arr,n);
        }
    }


}
