package oops.polymorphism;

/*
   Polymorphism in Java is a concept by which we can perform a single action in different ways.
   Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms.
   There are two types of polymorphism in Java:
       * compile-time polymorphism- Method Overriding
       * runtime polymorphism- Method Overloading
 */

class Test{
    public int max(int a,int b){
        return a>b?a:b;
    }
    public int max(int a,int b,int c){
        if(a>b && a>c)return a;
        else if(b>c)return b;
        return c;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        Test t=new Test();
        t.max(10,20);
        t.max(3,5,12);
    }
}
