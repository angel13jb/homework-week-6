package Week6;

public class Program04 {
  //two instace variables and two static variables
    int a = 10;
    int b= 20;
    static String c = "jalpa";
    static String d = "bhoraniya";
//calling variables in instance method
    public void test(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    //calling variables in static method
    public static void test1(){
        Program04 program04 = new Program04();
        System.out.println(program04.a);
        System.out.println(program04.b);
        System.out.println(c);
        System.out.println(d);
    }
    //calling both method in main method
    public static void main(String[] args) {
        Program04 program04 = new Program04();
        program04.test();
        program04.test1();
    }
}
