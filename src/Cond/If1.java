package Cond;

public class If1 {
    public static void main(String[] args) {
        int age = 15; // 사용자 나이

        if(age >= 18){ // 참 = true, 거짓 = false
            System.out.println("성인입니다.");
        }

        if(age < 18){
            System.out.println("미성년자입니다.");
        }
    }
}
