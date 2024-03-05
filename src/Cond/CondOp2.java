package Cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status =  (age <= 18) ? "성인" : " 미성년자"; // ()괄호안이 참이면 성인 아니면 미성

  /*      if (age >= 18) {
            status = "성인";
        }else {
            status = "미성년자";
        }*/
        System.out.println("age =" + age + "status = " + status);
    }
}
