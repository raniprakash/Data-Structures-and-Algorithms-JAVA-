package oops.inheritance.parameterisedConstructors;

public class Child extends Parent {
    Child(){
        System.out.println("No Parameters of Child");
    }
    Child(int y){
        System.out.println("Parameters of Child are present");
    }
    //Method of calling parameterised parent class is by using super keyword as follows
    Child(int x,int y){
        super(x);
        System.out.println("2 Parameters of Child "+y);
    }
}
