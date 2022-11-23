package oops.polymorphism;


//Method Overriding- Runtime Polymorphism
class Super{
    public void display(){
        System.out.println("Super Class");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub Class");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Super s=new Sub();
        s.display();
    }
}
