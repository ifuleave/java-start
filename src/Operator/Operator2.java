package Operator;

public class Operator2 {
    public static void main(String[] args) {
        String retulr1 = "hello" + "world";
        System.out.println(retulr1);

        String s1 = "string1";
        String s2 = "string2";
        String reseult2 = s1  +s2;
        System.out.println(reseult2 );

        // 문자열과 숫자 더하기1
        String reuslst3 = "a+b = " +10;
        System.out.println(reuslst3);

        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a+b = ";
        String result4 = str + num; // "a+b = 20" 문자열과 숫자를 더하면 숫자가 문자열로 저장됨
        System.out.println(result4);


    }
}
