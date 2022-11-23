package oops.inheritance.parameterisedConstructors;

public class Parent {
    Parent() {
        System.out.println("No Parameters of Parent");
    }

    Parent(int x) {
        System.out.println("Parameter "+x+" of Parent is present ");
    }
}