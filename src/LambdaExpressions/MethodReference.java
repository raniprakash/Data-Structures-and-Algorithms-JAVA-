package LambdaExpressions;

import java.util.Locale;
interface MyLambdaY
{
    public int display(String s1,String s2);
}
public class MethodReference {
    public MethodReference(String s){
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args) {
        MyLambdaY m1=String::compareTo;

        System.out.println(m1.display("HELLO","HI"));

    }
}
