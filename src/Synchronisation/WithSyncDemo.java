package Synchronisation;

class MyData1
{

    synchronized public void display (String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }

}

class MyThreadA extends Thread
{
    MyData d;
    public MyThreadA(MyData d){
        this.d=d;
    }

    public void run()
    {
        d.display("Hello World");
    }
}

class MyThreadB extends Thread
{
    MyData d;
    public MyThreadB(MyData d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Welcome");
    }
}

public class WithSyncDemo {
    public static void main(String[] args) {
        MyData data = new MyData();
        MyThreadA tA = new MyThreadA(data);
        MyThreadB tB = new MyThreadB(data);

        tA.start();
        tB.start();
    }
}