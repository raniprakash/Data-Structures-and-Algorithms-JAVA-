package Arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n= sc.nextInt();

        int[] marks= new int[n];
        System.out.println("Enter the marks of Students: ");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }

        int sum=0;
        int average=0;
        for(int i=0;i<n;i++){
            sum+=marks[i];
        }
        average=sum/n;
        System.out.println("Average : "+ average);
    }
}
