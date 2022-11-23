package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        /*
                    1
                  2   3
                4   5   6
              7   8   9   10
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(val+"   ");
                val++;
            }
            System.out.println();

        }
    }
}
