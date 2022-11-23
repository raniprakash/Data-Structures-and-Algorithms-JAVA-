import java.util.Scanner;

public class LargestNumber {
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int N= sc.nextInt();
            int[] arr=new int[N];
            for (int v:arr)
            {
                v=sc.nextInt();
            }
            int a=0,b=N-1;
            int min=a,max=b;
            while(a<max && b>min) {
                a++;
                b--;
                min = Math.min(min, arr[a]);
                max = Math.max(max, arr[b]);

            }
            swap(min,max);
            for(int i=0;i<N;i++)
            {
                System.out.print(arr[i]);
            }
            t--;
        }

    }
}
