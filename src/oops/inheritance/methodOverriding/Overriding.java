package oops.inheritance.methodOverriding;

//Dynamic Method Dispatch

class Super{
    public void display(){
        System.out.println("Hello!!!");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Hello!!!, How are you?");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Super su=new Super();
        su.display();

        Sub sb=new Sub();
        sb.display();

        Super su1=new Sub();
        su1.display();//Method of on object should be called.
    }
}
