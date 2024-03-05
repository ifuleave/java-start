package Loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;


        do{ // 먼저 실행
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while ( i < 3); // 이후 실행해서 참이면 do 문을 한번 더 실행 false면 나감

    }
}
