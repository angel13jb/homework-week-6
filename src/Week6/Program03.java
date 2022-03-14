package Week6;

public class Program03 {
    //instance and static variable
    int a = 500;
    static int b = 600;

    //calling variables in instance method
    public void test() {
        System.out.println(a);
        System.out.println(b);

    }

    //calling variables in static method
    public static void test1() {
        Program03 obj = new Program03();
        System.out.println(obj.a);
        System.out.println(obj.b);

    }

    //calling both method in main method
    public static void main(String[] args) {
        Program03 obj = new Program03();
        obj.test();
        obj.test1();

    }
}
