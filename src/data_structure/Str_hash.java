package data_structure;

import java.util.Scanner;

public class Str_hash {

    static  Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {

        String n= "abcdbca";
        int[] hash = new int[256];  //

        for (int i=0 ; i<n.length() ; i++)
        {
            int c = n.charAt(i);
            hash[c]= hash[c]+1;
        }

//        String q= sc.nextLine();
//        int s = Integer.parseInt(q);

        System.out.print("Enter number of queries: ");
        int queries = sc.nextInt();

        while (queries-- > 0)
        {
            System.out.print("Enter character to search: ");
            char q=  sc.next().charAt(0);
            System.out.println(hash[q]);
        }
    }
}
