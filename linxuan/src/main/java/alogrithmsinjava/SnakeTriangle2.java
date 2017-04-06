package alogrithmsinjava;

/**
 * Created by linxuan on 16/03/2017.
 */
public class SnakeTriangle2 {
    static int N = 15;

    static void snake(){
        int[][] A = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i + j == 0) {
                    A[0][0] = 1;
                } else if(i + j >= N){
                    A[i][j] = 0;
                } else if(i == 0){
                    A[i][j] = A[i][j - 1] + j;
                } else{
                    A[i][j] = A[i - 1][j] + i + j + 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(A[i][j] == 0) continue;
                else System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        snake();
    }
}
