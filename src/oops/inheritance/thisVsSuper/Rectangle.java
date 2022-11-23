package oops.inheritance.thisVsSuper;

public class Rectangle {
    int length;
    int breadth;
    int x=20;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void display(){
        System.out.println("Length: "+this.length);
        System.out.println("Breadth: "+this.breadth);
    }


    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,20);
        r.display();
        System.out.println();
        Cuboid c=new Cuboid(10,20,30);
        c.display();
    }
}