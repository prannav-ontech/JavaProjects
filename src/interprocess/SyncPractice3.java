package interprocess;


class WhiteBoard {
    String text;
    int S_num;
    int count = 0;

    public void attandance()
    {
        S_num++;
    }

   synchronized public void write(String text)
    {
        System.out.println("teacher is writing... "+ text);

        while (count!=0)
            try{  wait();} catch(InterruptedException e){}
        this.text = text;
        count= S_num;
        notifyAll();
    }

  synchronized public String read()
   {
       while (count==0)
           try{  wait();} catch(InterruptedException e){}

       String x=this.text;
       count--;
      if(count==0)
          notifyAll();
    return x;
   }

}


class Teacher extends Thread
{
    WhiteBoard wb;
    String[]t={"java is programming language","java follows OOPS","Java supports multi_threadiing","end"};

    Teacher(WhiteBoard w)
    {
        wb = w;
    }
    @Override
    public void run()
    {
        for (String s : t) wb.write(s);
        try { Thread.sleep(5000); } catch (InterruptedException e) {}
    }

}

class Student extends Thread
{
    WhiteBoard wb;
    String name;


    Student(String n,WhiteBoard w)
    {

        this.name=n;
        wb = w;
    }
    @Override
    public void run()
    {
        String text;
        wb.attandance();

        do {
            text = wb.read();
            System.out.println(name + " is reading " + text);
           // System.out.flush();
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }while(!text.equals("end"));
    }

}





public class SyncPractice3
{
    public static void main(String[] args)
    {
        WhiteBoard w = new  WhiteBoard();
        Teacher t = new Teacher(w);
        Student s1 = new Student("Harsh",w);
        Student s2 = new Student("Sharry",w);
        Student s3 = new Student("Mica",w);
        t.start();

        s1.start();
        s2.start();
        s3.start();


    }
}
