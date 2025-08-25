package data_structure;

public class GCD_HCF {
    public static void main(String args[]) {
        int n1 = 9, n2 = 12;
        int gcd = 1;

//        for (int i = Math.min(n1, n2); i >= 1; i--)
//        {
//            if (n1 % i == 0 && n2 % i == 0) { gcd = i;
//                break;}
//        }
//


        while (n1>0 && n2>0)
        {
            if (n1>n2) n1=n1 % n2;
            else if (n2>n1) n2=n2%n1;
        }

        if (n1==0) gcd=n2;
        else gcd=n1;






        System.out.println("GCD is: " + gcd);
    }
}
