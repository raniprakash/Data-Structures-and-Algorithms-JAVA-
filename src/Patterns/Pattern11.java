package Patterns;

import java.util.Scanner;
/*
            1
          2 0 2
        3 0 0 0 3
      4 0 0 0 0 0 4
    5 0 0 0 0 0 0 0 5

 */

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1) {
                    System.out.print(i+ " ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}