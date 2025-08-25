public class prime 
{
    public static void main(String[] args)
    { int count = 0;
        for (int i = 5; i <= 30; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Number of prime numbers between 5 and 30: " + count);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <=num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;








    }
}
