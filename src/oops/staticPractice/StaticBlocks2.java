package oops.staticPractice;

public class StaticBlocks2 {
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}
