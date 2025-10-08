import java.io.*;

public class StuChal_fileTWO
{
    public static void main(String r[]) throws Exception {
       String filePath = "/Users/prannavlomash/Desktop/My mac/Source1.txt";
       String  filePath2 = "/Users/prannavlomash/Desktop/My mac/Source2.txt";
       String filePath3 = "/Users/prannavlomash/Desktop/My mac/des.txt";

       FileInputStream s1= new FileInputStream(filePath);
        FileInputStream s2= new FileInputStream(filePath2);

        FileOutputStream des= new FileOutputStream(filePath3);

        SequenceInputStream seq = new SequenceInputStream(s1,s2);

        int b;
        while ((b= seq.read())!=-1)
        {
           des.write(b);
        }



   }
}
