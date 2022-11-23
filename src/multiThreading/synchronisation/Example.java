package multiThreading.synchronisation;

import javafx.scene.control.Tab;

class Table{
    synchronized public void printTable(int n)
    {
        for(int i=1;i<=5;i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class MyThreadA extends Thread
{
    Table t;
    MyThreadA(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(100);
    }

}

class MyThreadB extends Thread
{
    Table t;
    MyThreadB(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
public class Example {
    public static void main(String[] args) {
        Table t=new Table();
        MyThreadA t1=new MyThreadA(t);
        MyThreadB t2=new MyThreadB(t);
        t1.start();
        t2.start();
    }
}
