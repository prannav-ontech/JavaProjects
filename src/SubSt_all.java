//import static jdk.internal.org.jline.utils.Colors.s;

class SubS
{
    SubS() {
        System.out.println("ypu are in the class SubS");
    }

        public void meth( String sub)
        {
              int length = sub.length();
            for(int i =0 ; i < length;i++)
            {
               for (int j =i+1 ; j<=length ;j++)
               {
                   System.out.println(sub.substring(i,j));
               }
            }

        }

}

public class SubSt_all
{
  public static void main(String arg[ ])
   {
      SubS s1 = new SubS();
      s1.meth("abc");

   }
}