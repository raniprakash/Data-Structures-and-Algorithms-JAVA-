
import java.util.Scanner;
public class TakingUserInput {
    public static void main(String[] args) {
        /*
            import java.util.Scanner
            Scanner sc=new Scanner(System.in);
            To input integer value:
                    int x=sc.nextInt();
            To input double value:
                    double x=sc.nextDouble();
         */
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        float rate=sc.nextFloat();
        int time=sc.nextInt();

        float simpleInterest= principal*rate*time/100;

        System.out.println("The simple interest is " + simpleInterest);
    }
}
