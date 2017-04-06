package alogrithmsinjava;

/**
 * Created by linxuan on 18/03/2017.
 */
public class UglyNumber {
    static void printUgly(int n){
        if(n < 0) return;
        int[] A = new int[n];
        A[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0, q = 1;
        while(q < n){
            int min = minThree(A[p2]*2, A[p3]*3, A[p5]*5);
            A[q] = min;
            while(A[p2]*2 <= A[q])
                ++p2;
            while(A[p3]*3 <= A[q])
                ++p3;
            while(A[p5]*5 <= A[q])
                ++p5;
            ++q;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    private static int minThree(int a, int b, int c) {
        int min = a < b ? a : b;
        return min < c ? min : c;
    }

    public static void main(String[] args) {
        printUgly(15);
//        System.out.println(minThree(2,1,3));
    }
}
