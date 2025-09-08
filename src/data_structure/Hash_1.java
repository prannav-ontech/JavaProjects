package data_structure;


/*  for:- int[] arr = {1, 2, 1};
 i = 0 → arr[0] = 1
hash[arr[0]] = hash[1] + 1
hash[1] = 0 + 1 = 1
→ hash = [0,1,0,0,0,0,0,0,0,0]

i = 1 → arr[1] = 2
hash[2] = hash[2] + 1
hash[2] = 0 + 1 = 1
→ hash = [0,1,1,0,0,0,0,0,0,0]

i = 2 → arr[2] = 1
hash[1] = hash[1] + 1
hash[1] = 1 + 1 = 2
→ hash = [0,2,1,0,0,0,0,0,0,0]*/


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
