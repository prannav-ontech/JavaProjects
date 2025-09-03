package data_structure;

public class Recursion_3  // print an element N times using recursion................
{
    public static void main(String ar[])
    {
      Recursion_3 obj = new Recursion_3();
      obj.fun(1,5); //Starts from 1 and n is how many times we wanna print n ;
    }
 int fun(int i , int n )
 {
     if (i>n) return 0;

     else {
         System.out.println(n);
         fun(i+1,n);
     }
     return 0;
 }

}
