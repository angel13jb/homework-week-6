package Week6;


public class Program05 {
    //calling instance and static method in main method
    public static void main(String[] args) {
        Program05 obj = new Program05();
        obj.addition(10, 20, 30, 40);//100
        obj.subtraction(90, 40, 30);//20
        multiplication(40, 20);//800
        division(20, 5);//4
    }

    //instance method with parameters
    public void addition(int e, int f, int g, int h) {
        System.out.println("Addition =" + (e + f + g + h));//string concatenation method
    }

    //instance method with parameters
    public void subtraction(int b, int c, int d) {
        System.out.println("Subtraction=" + (b - c - d));//string concatenation method

    }

    //static method with parameters
    public static void multiplication(int a, int b) {
        System.out.println("multiplication=" + a * b);//string concatenation method
    }

    //static method with parameters
    public static void division(int c, int d) {
        System.out.println("division=" + c / d);// string concatenation method
    }
}
