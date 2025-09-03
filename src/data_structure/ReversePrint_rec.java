package data_structure;

public class ReversePrint_rec
{
    public static void main (String ar[])
    {
        ReversePrint_rec obj = new ReversePrint_rec();
        obj.fun(5);
    }


    static int fun(int n)
    {
        if(n<1) return 0;
        else {
            System.out.println(n);
            fun(n-1);
        }
        return 0;
    }
}
