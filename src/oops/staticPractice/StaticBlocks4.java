package oops.staticPractice;

class Test1{
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }
}

public class StaticBlocks4 {
    public static void main(String[] args) {
        Test1 t=new Test1();
        System.out.println("Main");


    }
}
