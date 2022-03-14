package Week6;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        //swap two variable
        int a,b,temp;//declare variables
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();//1
        b= sc.nextInt();//2
        System.out.println("Before swapping "+a+" "+b);//1 2 before swapping
        temp=a;//1
        a=b;//2
        b=temp;//1
        System.out.println("After swapping "+a+" "+b);//2 1 after swapping

    }

}
