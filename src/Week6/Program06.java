package Week6;

import java.util.Scanner;

public class Program06 {
    //Area of circle
    //PI= 3.14
    //area= PI*r*r
    public static void main(String[] args) {
        final double PI =3.14,area;
        int r;
        System.out.println("Enter radius of circle");//enter any value
        Scanner obj = new Scanner(System.in);//import scanner to enter input while run the program
        r=obj.nextInt();//define variable r
        area = PI*r*r;
        System.out.println("Area of the circle=" + area);//final result showing circle area



    }

}
