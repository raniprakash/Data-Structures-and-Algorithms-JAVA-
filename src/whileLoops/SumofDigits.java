package whileLoops;

import java.util.Scanner;
/*
    Number of digits in a number(n)=log10(n)+1
 */

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
            int lastDigit=temp%10;
            temp/=10;
            sum+=lastDigit;

        }
        System.out.println("The sum of the digits of "+n+" is "+sum);
    }
}
