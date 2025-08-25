package data_structure;

public class Recursion_2
{
    int count =0;
    public static void main(String args[])
    {
      Recursion_2 obj = new Recursion_2();
      obj.fun();
    }

    void fun()
    {
        if (count == 4) return;
        else {
            System.out.println(count);
            count++;
            fun();

        }

    }
}
