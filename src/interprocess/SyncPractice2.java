package interprocess;

class Mydata
{
    int value;
    boolean flag= true; //to achieve interthread communication..

 synchronized    public void set(int v)
    {
        while(flag!=true)
          try{  wait();} catch(InterruptedException e){}
        value=v;
        flag=false;
        notify();
    }
    /* because producer is using Set method and consumer is using get method
    * so they are using different methods so no question of conflict here
    * both are independent methods*/
  synchronized   public int get()
    {
        int x;
        while(flag!=false)
            try{  wait();} catch(InterruptedException e){}
        x=value;
        flag=true;
        notify();
        return x;
    }

}

 class Producer extends Thread
{
    Mydata obj;

    Producer(Mydata obj)
    {
       this.obj=obj;
    }

  public void run()
    {
        int count=0;
     // try{Thread.sleep(5000);}catch(InterruptedException e){}
        while(true)
        {
            obj.set(count);
            System.out.println("Producer "+ count);
            count++;
        }
    }
}


class Consumer extends Thread
{
    Mydata obj;
    Consumer(Mydata obj)
    {
        this.obj= obj;
    }

    public void run()
    {
       // try{Thread.sleep(1000);}catch(InterruptedException e){}
        int val=0;
        while (true)
        {
           val= obj.get();
           System.out.println("Consumer "+ val);
        }
    }
}



public class SyncPractice2
{
    public static void main(String args[])
    {
        Mydata obj=new Mydata();
        Producer p=new Producer(obj);
        Consumer c=new Consumer(obj);
        p.start();
        c.start();
    }
}
