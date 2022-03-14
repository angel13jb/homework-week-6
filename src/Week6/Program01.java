package Week6;

public class Program01 {
    //instance method with instance variables
    int a = 10;
    int b = 20;

    public void test() {
        System.out.println(a);
        System.out.println(b);

    }
// calling instance method in main method
    public static void main(String[] args) {
        Program01 obj = new Program01();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.test();
    }
}
