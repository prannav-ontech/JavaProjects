class OverflowException extends Exception
{
    public String toString()
    {
        return "Stack Overflow Exception";
    }

}

class UnderflowException extends Exception
{
    public String toString()
    {
        return "Stack Underflow Exception";
    }
}

class Stack
{
    public int size;
    int top=-1;
   public int[] arr;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }



 int push(int n ) throws OverflowException
 {
     if (top==size-1)
         throw new OverflowException();
     else {
         arr[++top]=n;
         return top;

     }
 }

 int pop() throws UnderflowException
 {
     if (top==-1)
         throw new UnderflowException();
     else {
         return arr[top--];
     }
 }

}






public class Stu_chalange_StackClass
{
    public static void main(String[] args) throws UnderflowException, OverflowException {
        Stack s1= new Stack(2);
       try {
           s1.pop();
       }
       catch (UnderflowException e)
       {
           System.out.println(e);
       }
       try {
           s1.push(2);
           s1.push(21);
           s1.push(90);
       }
       catch (OverflowException f)
       {
           System.out.println(f);
       }
        System.out.println("Elements are :");
       for (int i=0 ; i<=s1.top ;i++)
       {
           System.out.println(s1.arr[i]);
       }

    }
}
