package oops.inheritance.parameterisedConstructors.Example;

public class Main {
    public static void main(String[] args) {
        Cuboid c=new Cuboid();
        System.out.println(c.volume());

        Cuboid c1=new Cuboid(10);//here non parameterised parent class is called so l=1,b=1 and h=10
        System.out.println(c1.volume());

        Cuboid c2=new Cuboid(10,20,30);//here parameterised constructor is called using super keyword.
        System.out.println(c2.volume());
    }
}
