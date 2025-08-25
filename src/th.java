import java.security.spec.RSAOtherPrimeInfo;

class Mythread extends Thread
{
    public void run()
    {
        int i=0;
        while(true){
            System.out.println("hello");
            i++;
        }
    }
}


public class th {
    public static void main(String[] args) {

        Mythread t1 = new Mythread();
        t1.start();
        int i=1;
        while(true)
        {
            System.out.println("world");
            i++;
        }

    }
}
