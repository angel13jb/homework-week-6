package Week6;

import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        //calculate area of triangle
        //need base and height value
        int base = 0;
        int height = 0;
        int area = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of height of the Triangle :");
        height=sc.nextInt();
        System.out.println("Enter length of base of the Triangle :");
        base =sc.nextInt();
        //area= (base * height)/2
        area = (base*height)/2;
        System.out.println("The area of Triangle :"+area);



    }
}