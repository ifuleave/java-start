package Scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존
        if (true) {
            int x = 20;// x  생존시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }// x 생존
        System.out.println("main m = " + m);

    }
}
