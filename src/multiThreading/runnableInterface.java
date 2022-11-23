package multiThreading;

public class runnableInterface implements Runnable {
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+ " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        runnableInterface t=new runnableInterface();
        Thread t1=new Thread(t);
        t1.start();
        int i=1;
        while (true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
