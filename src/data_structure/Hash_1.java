package data_structure;


import java.util.Scanner;

public class Hash_1
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 1, 3};
        int[] hash = new int[10];
            for (int i = 0; i < arr.length; i++)
            {
                hash[arr[i]] = hash[arr[i]] + 1;
            }
        System.out.println("give numbers");

            int q=sc.nextInt();
            while(q-->0)
            {
                int a=sc.nextInt();
                System.out.println(" ");
                System.out.println(hash[a] + " Times....");
                System.out.println("");

            }


    }
}
