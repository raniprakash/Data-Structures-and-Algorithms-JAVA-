package oops.inheritance.thisVsSuper;

public class Cuboid extends Rectangle{
        int height;
        int x=10;
        Cuboid(int l,int b,int h){
            super(l,b);
            height=h;
        }
        void display(){
            System.out.println(super.x);
            System.out.println(x);
        }

}
