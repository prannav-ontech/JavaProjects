package data_structure;

public class Recursionn {
    public static void main(String ar[])
    {
       int y=3;
       Recursionn r = new Recursionn();
       r.fun2(y);
    }
    void fun2(int x)
    {
        if(x>0) {
//            System.out.println(x);
            fun2(x - 1);
            System.out.println(x);
        }
    }
}
