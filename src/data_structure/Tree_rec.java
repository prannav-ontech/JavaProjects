package data_structure;

public class Tree_rec
{

    public static void main (String arg[])
    {
       fun(3);
    }

  static void fun(int x)
    {
        if (x>0)
        {
            System.out.println(x);
            fun(x-1);
            fun(x-1);
        }
    }
}

