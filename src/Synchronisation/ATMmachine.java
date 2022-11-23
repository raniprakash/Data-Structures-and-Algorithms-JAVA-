package Synchronisation;


class ATM
{

    synchronized public void checkBalance(String name)
    {
        System.out.print(name+" is checking ");
        try {
            Thread.sleep(1000);
        }catch (Exception e){}
        System.out.println("balance.");
    }
    synchronized public void withdrawAmount(String name,int amount)
    {
        System.out.print(name+" is withdrawing "+amount);
        try {
            Thread.sleep(100);
        }catch (Exception e){}
        System.out.println(" INR.");
    }
}

class Customer extends Thread
{
    ATM atm;
    String name;
    int amount;

    Customer(String name,int amount,ATM atm)
    {
        this.name=name;
        this.amount=amount;
        this.atm=atm;
    }
    void useATM()
    {
        atm.checkBalance(name);
        atm.withdrawAmount(name, amount);
    }

    public void run()
    {
        useATM();
    }
}
public class ATMmachine {
    public static void main(String[] args) {
        ATM atm=new ATM();

        Customer c1=new Customer("John",5000,atm);
        Customer c2=new Customer("Smith",10000,atm);

        c1.start();
        c2.start();

    }
}
