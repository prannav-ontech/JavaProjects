package data_structure;

public class StrPal_rec {

    public static void main(String args[])
    {
        String str = "abba";
        int n = str.length();
        int i=0;

        if(fun(str,i,n)) System.out.println("The string is palindrome");
        else System.out.println("The string is not palindrome");


    }

    private static boolean fun(String str, int i ,int n )
    {
       if (i>=n/2) return true;

       if(str.charAt(i)!= str.charAt(n-i-1)) return false;

       else return fun(str,i+1,n-i-1);


    }
}
