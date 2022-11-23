package Patterns;

import java.util.Scanner;
/*

                       0
                     9 0 9
                   8 9 0 9 8
                 7 8 9 0 9 8 7
               6 7 8 9 0 9 8 7 6
             5 6 7 8 9 0 9 8 7 6 5
           4 5 6 7 8 9 0 9 8 7 6 5 4
         3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
       2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
     1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1
 */

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int val=n-i+1;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(i==j){
                    System.out.print("0"+" ");
                }else {
                    System.out.print((val + " "));
                    val++;
                }
            }
            val=n-1;
            for(int j=i+1;j<=2*i-1;j++){

                System.out.print(val+" ");
                val--;
            }
            System.out.println();
        }

    }
}
