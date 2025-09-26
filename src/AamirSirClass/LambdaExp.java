package AamirSirClass;

import static java.lang.System.*;

interface myLambda
{
    void fun();
}

public class LambdaExp
{
    public static void main(String arg[])
    {
        myLambda obj = () -> {
            out.println("Hello World");
        };

        obj.fun();
    }
}
