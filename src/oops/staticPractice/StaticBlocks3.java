package oops.staticPractice;

class Test{
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }
}
public class StaticBlocks3 {
    public static void main(String[] args) {
        System.out.println("Main");
    }
}
