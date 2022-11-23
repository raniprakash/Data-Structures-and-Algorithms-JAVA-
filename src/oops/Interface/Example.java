package oops.Interface;

interface Test1{
    void meth1();
    void meth2();
}

class Test2 implements Test1
{
    @Override
    public void meth1() {
        System.out.println("Meth1 of class Test2");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2 of class Test2");
    }
    public void meth3(){
        System.out.println("Meth3 of class Test2");
    }
}

public class Example {
    public static void main(String[] args) {
           Test1 t=new Test2();
           t.meth1();
           t.meth2();
    }
}
