package data_structure;

public class Facto_rec
{
    public static void main(String args[])
    {

    }

    static int fun(int n)
    {
       if (n==1) return 0;
       else return n*fun(n-1);
    }
}
