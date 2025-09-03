package data_structure;

public class back_tracking_rec
{
    public static void main(String arh[])
    {
        back_tracking_rec obj = new back_tracking_rec();
      //  obj.fun(5,5);
        obj.fun1(1,5);
    }


    private static int fun(int i ,int n)    // From 1 to n . uprinted linerarlly using backtracking...
    {
        if(i<1) return 0;
        else{
            fun(i-1,n);
            System.out.println(i);
        }
return 0;
    }

    private static int fun1(int i , int n)
    {
        if(i>n) return 0 ;
        else{
            fun1(i+1,n);
            System.out.println(i);
        }
        return 0;
    }
}
