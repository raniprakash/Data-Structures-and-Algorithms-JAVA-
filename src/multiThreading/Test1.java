package multiThreading;

public class Test1 extends Thread{
    public void run(){
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        t.start();
        int i=1;
        while (true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
