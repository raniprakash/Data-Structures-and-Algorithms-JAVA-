package oops.inheritance.parameterisedConstructors.Example;

public class Cuboid extends Rectangle{
    int height;
    Cuboid(){
        height=1;
    }
    Cuboid(int h){
        height=h;
    }
    Cuboid(int l,int b,int h){
        super(l,b);
        height=h;
    }
    int volume(){
        return length*breadth*height;
    }
}
