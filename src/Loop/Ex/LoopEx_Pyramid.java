package Loop.Ex;

public class LoopEx_Pyramid {
    public static void main(String[] args) {
        int rows = 2;

        for(int i=0; i <= rows; i++){
          for(int j=1; j<=i ; j++){
              System.out.print("*");
          }
            System.out.println();
        }
    }
}
