package alogrithmsinjava;

/**
 * Created by linxuan on 18/03/2017.
 * kth number in fibonacci, from zero
 */
public class KthInFib {
    static int kthInFib(int k){
        if(k <= 0) return -1;
        if(k == 1 || k == 2) return 1;
        int p = 2, f1 = 1, f2 = 1, f = 0;
        while(p < k){
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            ++p;
        }
        return f;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(kthInFib(i));
        }

    }
}
