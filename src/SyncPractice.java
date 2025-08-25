class ATM
{
    synchronized public void check_balance (String name, int balance)
    {
        System.out.print(name + " is checking balance...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}

        System.out.println("balance is:- " + balance);
    }

    synchronized public int withdraw (String name, int balance, int amt)
    {
        System.out.print(name + " is withdrawing...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}

        if(balance >= amt) {
            balance -= amt;
            System.out.println(amt + " Rs withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + name);
        }
        return balance;
    }
}

class Customer extends Thread
{
    ATM atm;
    String name;
    int balance;
    int withdrawAmt;

    Customer(ATM atm, String name, int balance, int withdrawAmt)
    {
        this.atm = atm;
        this.name = name;
        this.balance = balance;
        this.withdrawAmt = withdrawAmt;
    }

    public void run()
    {
        atm.check_balance(name, balance);
        balance = atm.withdraw(name, balance, withdrawAmt);
    }
}

public class SyncPractice {
    public static void main(String[] args)
    {
        ATM atm = new ATM();

        Customer c1 = new Customer(atm, "Prannav", 500000, 30000);
        Customer c2 = new Customer(atm, "Anu", 200000, 10000);

        c1.start();
        c2.start();
    }
}
