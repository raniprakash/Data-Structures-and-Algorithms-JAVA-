package oops.inheritance.parameterisedConstructors.Example;

public class Rectangle {
    int length;
    int breadth;

    Rectangle(){
        length=breadth=1;
    }
    Rectangle(int l, int b){
        length=l;
        breadth=b;
    }
}
