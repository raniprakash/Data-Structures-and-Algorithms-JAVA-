package LambdaExpressions;

@FunctionalInterface
interface MyLambda
{
    public void display();
}

/*class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}*/

public class LambdaDemo1 {
    public static void main(String[] args) {

        MyLambda m=()->{System.out.println("Hello world");};

        /*//MyLambda m=new My();
        MyLambda m=//new MyLambda()
                ()->

            //public void display()
            {
                System.out.println("Hello World");

        };*/
        m.display();

    }

}
