package multiThreading.synchronisation;

class ATM{
    synchronized public void checkBalance(String name) {
        System.out.print(name + " checking ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.print("balance.");
    }

   synchronized public void withdrawAmount(String name,int amount)
    {
        System.out.print(name+" withdrawing ");
        try{Thread.sleep(1000);}catch (Exception e){}
        System.out.print(amount);
    }
}

class Customer extends Thread
{
    String name;
    int amount;
    ATM atm;
    Customer(String s,ATM a,int amt)
    {
        name=s;
        amount=amt;
        atm=a;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdrawAmount(name,amount);
    }
    public void run(){
        useATM();
    }
}
public class ATMmachine {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Customer c1=new Customer("John",atm,100);
        Customer c2=new Customer("Rita",atm,200);
        c1.start();
        c2.start();


    }
}
