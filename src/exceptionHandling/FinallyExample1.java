package exceptionHandling;

public class FinallyExample1 {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(10/0);

        }
        finally {
            System.out.println("Final Message");

        }
    }
}
