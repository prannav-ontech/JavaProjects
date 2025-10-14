import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StuChal_File
{
    public static void main(String args[]) throws Exception {
        String filePath = "/Users/prannavlomash/Desktop/My mac/Source1.txt";



        // Created a file (Source1)
        try
        {
            FileOutputStream  fos= new FileOutputStream(filePath);
            String data = "HI THIS UPPER CASE...";
            fos.write(data.getBytes());
            System.out.println("File created at: " + filePath);
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error");
        }






        // Coping the data for source1 to a new file source2
try{

  String  filePath2 = "/Users/prannavlomash/Desktop/My mac/Source2.txt";
    FileOutputStream s2= new FileOutputStream(filePath2);
    FileInputStream s1= new FileInputStream(filePath);

    //byte b [] = new byte[s1.available()];

    int n;
    System.out.println("File created at: " + filePath2);
    while ((n = s1.read()) != -1) {
        // process bytes in b[0..n-1]
        System.out.println(n);
        if(n>=65 && n<=90) s2.write(n+32);
        else s2.write(n);
    }



}

catch (FileNotFoundException e) {
    System.out.println("File not found");
} catch (IOException e) {
    System.out.println("Error");
}
    }
}
