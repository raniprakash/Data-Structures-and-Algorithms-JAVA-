package Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of first matrix:");
        int rows1=sc.nextInt();
        int cols1= sc.nextInt();

        int a[][]=new int[rows1][cols1];

        System.out.println("Enter the dimensions of second matrix:");
        int rows2= sc.nextInt();
        int cols2= sc.nextInt();

        int b[][]=new int[rows2][cols2];
        if(rows1!=cols2){
            System.out.println("Matrix Multiplication is not possible!!!!");
        }
        else{
            System.out.println("Enter the values of the first matrix:");
            for(int i=0;i<rows1;i++){
                for (int j=0;j<cols1;j++){
                    a[i][j]= sc.nextInt();
                }
                System.out.println();
            }
            System.out.println("Enter the values of the second matrix:");
            for(int i=0;i<rows2;i++){
                for (int j=0;j<cols2;j++){
                    b[i][j]= sc.nextInt();
                }
                System.out.println();
            }
            int c[][]=new int[rows1][cols1];
            for(int i=0;i<rows1;i++){
                for (int j=0;j<cols1;j++){
                    c[i][j]= a[i][j]*b[i][j];
                }
                System.out.println();
            }
            System.out.println("The resultant matrix is:");
            for(int i=0;i<rows1;i++){
                for (int j=0;j<cols1;j++){
                    System.out.print(c[i][j]+ " ");
                }
                System.out.println();
            }
        }

    }
}
