package Operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");// 리터럴 비교
        boolean reuslt2 = str1.equals("문자열1");
        boolean reuslt3 = str2.equals(str1);

        System.out.println(result1);
        System.out.println(reuslt2);
        System.out.println(reuslt3);
    }
}
