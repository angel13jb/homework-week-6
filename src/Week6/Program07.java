package Week6;

import java.util.Scanner;

public class Program07 {
    //convert temperature fahrenheit to degree celsius
    public static void main(String[] args) {

        float celsius, fahrenheit;//using variable as celsius,fahrenheit
        Scanner temp = new Scanner(System.in);//import scanner
        System.out.println(" Enter temperature in fahrenheit");//enter any value
        fahrenheit = temp.nextInt();
        celsius = ((fahrenheit - 32) * 5 / 9);
        System.out.println("Temperature value in celsius =" + celsius);//value change in celsius
        celsius = temp.nextFloat();


    }
}
