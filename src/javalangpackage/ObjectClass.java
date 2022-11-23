package javalangpackage;
import java.lang.*;

//Every class is directly or indirectly inheriting from object class.
public class ObjectClass {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        Object o3=o1;




        //toString() method is a default, so need to mention separately
        System.out.println(o1);
        System.out.println(o1.toString());

        //equals(object obj)
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));//if it is refering to the same object, then it returns true.

        //hashcode()
        System.out.println(o1.hashCode());
    }
}
