package Cond.Ex;

public class ScoreEx4 {
    public static void main(String[] args) {
        // 어바웃타임 - 평점9 ,토이 스토리 - 평점8 ,고질라 - 평점7

        double rating = 9;

        if(rating <= 9){
            System.out.println("'어바웃타임'을 추천합니다.");
        }

         if (rating <= 8) {
            System.out.println("'토이스토리'을 추천합니다.");
        }

         if (rating <= 7) {
            System.out.println("'고질라'을 추천합니다.");
        }

    }
}
