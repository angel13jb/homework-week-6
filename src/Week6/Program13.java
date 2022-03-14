package Week6;

import java.util.Scanner;

public class Program13 {
    //find average of three number
    //formula is average = (a+b+c)/3
    public static void main(String[] args) {
        int num1,num2,num3;//describe variables
        double average;
        Scanner sc = new Scanner(System.in);//import scanner
        System.out.println("Enter the first number:");//10
        num1=sc.nextInt();
        System.out.println("Enter the second number:");//10
        num2 =sc.nextInt();
        System.out.println("Enter the third number:");//10
        num3 = sc.nextInt();
        average = (num1+num2+num3)/3;//(10+10+10)/3
        System.out.println("Average of the numbers =" +average);//result will be 10.0
    }
}
