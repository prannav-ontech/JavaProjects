package data_structure;

public class Prime_num
{
    boolean flag =true;
    public static void main(String args[])
    {
        int start =5;
        int end=30;
        int count=0;


        for(int i= start; i<=end;i++)
        {
            boolean flag = isPrime(i);
            if (flag == true) count++;
        }
        System.out.println("Number of prime numbers between 5 and 30: " + count);


    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; // divisor found → not prime
        }
        return true; // no divisors → prime
    }
}
