package data_structure;

public class Armstrong_number
{
    public static void main(String args[]) {
        int num = 153;
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int n = num % 10;
            sum = sum + (n * n * n);
            num = num / 10;
        }

        if (sum == temp) System.out.println("The number is armstrong number");
        else {
            System.out.println("The number is not armstrong number");
        }
    }

}
