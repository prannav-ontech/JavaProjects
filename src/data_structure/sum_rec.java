package data_structure;

public class sum_rec {
    public static void main (String arg[])
    {
         sum_rec obj = new sum_rec();
         obj.fun1(10,0);

    }

    private static int fun1(int n, int sum)
    {
        if(n<1) {System.out.println(sum);
        return 0;}
        else {
            fun1(n-1,sum+n);
            //System.out.println(sum);
        }
        return 0;
    }
}
