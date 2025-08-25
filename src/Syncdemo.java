
class Mydata  //Shared object
{
    public void display(String str)
    {
        synchronized (this)
        {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));// Critical section.

                try{Thread.sleep(500);}catch(Exception e){}
            }
        }
    }
}

class MyThread1 extends Thread
{
    Mydata d;

     MyThread1(Mydata d)
    {
        this.d = d ;
    }

    public void run ()
    {
        d.display("hello world");
    }
}

class MyThread2 extends Thread
{
    Mydata d;

     MyThread2(Mydata data)
    {
       d=data ;
    }

    public void run ()
    {
        d.display("Welcome all");
    }
}


public class Syncdemo {
    public static void main(String[] args)
        {
            Mydata data = new Mydata();

            MyThread1 t1 = new MyThread1(data);
            MyThread2 t2 = new MyThread2(data);
            t1.start();
            t2.start();

        }
}
