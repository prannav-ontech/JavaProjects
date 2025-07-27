import java.awt.*;

interface Computer
{
    void code();
}

/*By creating this computer interface we just generalize the term computer
* now we can use desktop as well as Laptop accordingly ......*/


class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code,compile,run : Faster.. ......");
    }
}

class Laptop implements Computer
{
   public  void code()
    {
        System.out.println("code,compile,run......");
    }
}


class Fresher
{
    void job(Computer lap)
    {
      lap.code();
    }
}

public class Inter_Second
{
    public static void main(String[] args)
    {
        Laptop lap = new Laptop();
        // every fresher need different laptop object so everytime we need to create new laptop object...
        // first you have to create an object of laptop to pass it to other object.....

        Desktop desk = new Desktop();
        // As well as laptop ..... we have to create an object of desktop too if we want to give laptop to any employee..

        Fresher obj = new Fresher();
        obj.job(lap);
    }
}
