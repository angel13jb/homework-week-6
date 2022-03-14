package Week6;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
    //adition of binary number 10,11
        Scanner sc = new Scanner(System.in);//import scanner
        System.out.println("Enter first binary number :");//enter value 10
        String a = sc.next();//
        System.out.println("Enter second binary number :");//enter value 11
        String b = sc.next();//
        int n1 = Integer.parseInt(a, 2);//convert string value to int
        int n2 = Integer.parseInt(b, 2);//convert string value to int
        int n3 = n1 + n2;
        System.out.println("Addition to binary numbers is :" + Integer.toBinaryString(n3));//reult is 101
    }
}
