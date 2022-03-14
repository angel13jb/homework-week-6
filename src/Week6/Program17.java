package Week6;

import java.util.Scanner;

public class Program17 {
    //convert decimal number in binary number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number :");//5
        int a =sc.nextInt();
        System.out.println("Convert number as binary number is : ");//101
        System.out.println(Integer.toBinaryString(a));//by using binary string method

    }
}

