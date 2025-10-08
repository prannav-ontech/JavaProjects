import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_example
{
    public static void main(String args[]) throws FileNotFoundException {

        String filePath = "/Users/prannavlomash/Desktop/My mac/testfile.txt";


        // output stream
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            String data = "Hello from Java on macOS!";
            fos.write(data.getBytes());


            String d2 = "Hello from Java on Windows!";
            fos.write(d2.getBytes());

            System.out.println("File created at: " + filePath);


            fos.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }





      // input stream
        try
        {FileInputStream filI = new FileInputStream(filePath);
            byte b[]= new byte[filI.available()];
            filI.read(b);
            String data = new String(b);  // convert the byte array into string for printing ....
            System.out.println("File content: " + data);
            filI.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}


