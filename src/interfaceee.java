
interface A
{
    int age =21;
    String area = "punjab";

    void show();
    void config();
}

class B implements A
{

    @Override
    public void show()
    {
        System.out.println("Your age is " + age + " and area is " + area);
    }

    @Override
    public void config()
    {
        System.out.println("you are in configure");
    }
}


public class interfaceee
{
    public static void main(String []a)
    {
       B obj =  new B();
       obj.show();
       obj.config();

        System.out.println(A.age);
        System.out.println(A.area);
    }
}
