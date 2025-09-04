package data_structure;

public class reverse_arr_rec
{

   static  int arr[] = {2,3,4,5,6};
   static int n = arr.length; // we can use static in static field otherwise we had to create object to use non static field..


    public static void main(String args[])
    {
       reverse_arr_rec obj = new reverse_arr_rec();
       obj.fun(arr,0,n-1);

       for(int x:arr)
       {
           System.out.println(x);
       }


    }

      private void fun(int arr[],int left, int right)
    {
        if (left>=right) return ;
        else{
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            fun(arr,left+1 ,right-1);

        }
    }

}
