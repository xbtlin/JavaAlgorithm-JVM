package alogrithmsinjava;

/**
 * Created by linxuan on 19/03/2017.
 */
public class PhoneKeyBoard {

    static int geti(int i){
        if(i == 0) return 3;
        return (i - 1) / 3;
    }

    static int getj(int j){
        if(j == 0) return 1;
        if(j % 3 == 0) return 2;
        return (j % 3 - 1);
    }

    static void keyBoard(int[] A, int n, int k){
        if(n - k < 1) System.out.print(A[n]);
        if(geti(A[k]) <= geti(A[k + 1]) &&
                getj(A[k]) <= getj(A[k + 1])){

        }
    }

    public static void main(String[] args) {
        
    }
}
