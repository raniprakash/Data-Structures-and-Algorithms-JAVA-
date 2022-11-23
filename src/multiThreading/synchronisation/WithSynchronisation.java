package multiThreading.synchronisation;

class MyData2{
    public void display(String str)
    {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}

class Thread1 extends Thread
{
    MyData2 d;
    public Thread1(MyData2 d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Hello World");
    }
}

class Thread2 extends Thread
{
    MyData2 d;
    public Thread2(MyData2 d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Welcome All");
    }
}
public class WithSynchronisation {
    public static void main(String[] args) {
        MyData2 a=new MyData2();
        Thread1 a1=new Thread1(a);
        Thread2 a2=new Thread2(a);
        a1.start();
        a2.start();
    }

}
