import java.util.Scanner;

public class Remove_space
{
    public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String email=sc.nextLine();

    if(email.contains(" "))
    {
        email= email.replace(" ","");
        System.out.println(email);
    }
    else
        System.out.println(email);
   }
}
