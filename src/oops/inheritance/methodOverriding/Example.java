package oops.inheritance.methodOverriding;

class Car{
    public void start(){
        System.out.println("Car is Started.");
    }
    public void accelerate(){
        System.out.println("Car is accelerated.");
    }
    public void changeGear(){
        System.out.println("Gear is changed manually.");
    }
}

class LuxuryCar extends Car{
    public void changeGear(){
        System.out.println("Gear is changed automatically.");
    }
    public void openRoof(){
        System.out.println("It has open roof facility.");
    }
}
public class Example {
    public static void main(String[] args) {
            Car c=new Car();
            c.start();
            c.accelerate();
            c.changeGear();
        System.out.println();
            LuxuryCar c1=new LuxuryCar();
            c1.changeGear();
            c1.openRoof();
        System.out.println();
            Car c2=new LuxuryCar();//here, you can't call the methods of object class, so openRoof() can't be called!!!
            c2.start();
            c2.accelerate();
            c2.changeGear();
    }
}
