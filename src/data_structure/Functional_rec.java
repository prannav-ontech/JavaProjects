package data_structure;

    /* this pattern states that we can use recursion can be used for breaking
    * down a larger problem into smaller pecies, by using functions only
    * no using parameters,
    *          for example, -
    *  the problem is the same that is sum of n numbers as we have done it earlier by passing
    *    parameters and comparing ... we could also have done it another way ..
    * that is :-
    * ------let say : f(n) is = sum of n numbers,
    * ------ so if n = 3 there by => 3+f(2) is also correct => 2+f(1) => 1+f(0) ----------*/




public class Functional_rec
{
    public static void main(String args[])
    {
        Functional_rec obj = new Functional_rec();
        System.out.println(obj.fun(5));
    }

    static int fun(int n )
    {
        if (n==0) return 0 ;
        else return n+fun(n-1);
    }
}
