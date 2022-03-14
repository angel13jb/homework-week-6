package Week6;

import java.util.Scanner;

public class Program10 {
    //multiplication table up to 10
    public static void main(String[] args) {
        int number,i;//describe vaiables
        Scanner sc = new Scanner(System.in);//impprt scanner
        System.out.println("Enter number to print multiplication table");//enter any value
        number =sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+(number*i) );//outcome will multiplication upto 10
        }

    }
}
