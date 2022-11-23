
import java.util.*;


public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] T=new int[N];
        for(int i=0;i<N;i++)
        {
             T[i]=sc.nextInt();
        }
        int count;
        for(int i=0;i<N;i++)
        {
             count=0;
            for(int j=i+1;j<N;j++)
            {
                if(T[i]==T[j])
                    count++;
            }
            if(count%2==0 && count!=0) {
                System.out.println(T[i]);return;
            }
        }
        System.out.println("-1");

    }
}
