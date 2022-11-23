package multiThreading.interThreadCommunication;

class MyData{
    int value;
    synchronized public void setValue(int v)
    {
        value=v;
    }
    synchronized public int getValue()
    {
        int x;
        x=value;
        return x;
    }
}

class Producer extends Thread
{
    MyData data;
    public Producer(MyData data){
        this.data=data;
    }
    public void run()
    {
        int count=1;
        while(true) {
            data.setValue(count);
            System.out.println("Producer: " + count);
            count++;
        }
    }
}
class Consumer extends Thread
{
    MyData D;
    public Consumer(MyData d)
    {
        D=d;
    }
    public void run()
    {

        int value;
        while(true) {
            value = D.getValue();
            System.out.println("Consumer: " + value);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        MyData d=new MyData();
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);

        p.start();
        c.start();
    }
}
