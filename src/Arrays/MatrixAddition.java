package Arrays;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int a[][]=new int[rows][cols];
        int b[][]=new int[rows][cols];

        System.out.println("Enter the values of Matrix1:");
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter the values of Matrix2:");
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                b[i][j]= sc.nextInt();
            }
        }

        int c[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of Matrix 1 and 2:");
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
