package data_structure; // Fibonacci series using recursion.......



public class Multi_recCall {
    public static void main(String args [])
    {
        Multi_recCall mr=new Multi_recCall();
        System.out.println(fibo(4));
    }

    static int fibo(int n)
    {
        if (n<=1) return n;
        else {
            int last=fibo(n-1);
            int slast=fibo(n-2);
            return last+slast;
        }
        // we could only use : return fibo(n-1) + fibo (n-2) here ...
    }
}
