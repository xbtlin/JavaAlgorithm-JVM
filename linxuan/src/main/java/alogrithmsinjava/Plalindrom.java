package alogrithmsinjava;

/**
 * Created by linxuan on 19/03/2017.
 */
public class Plalindrom {
    static boolean judge(char[] A){
        if(A == null || A.length < 1) return false;
        int s = 0, e = A.length - 1;
        while(s < e){
            if(A[s] == A[e]){
                ++s;
                --e;
                continue;
            } else break;
        }
        return s == e || e - s == 1;
    }

    static boolean judgeRecur(char[] A, int s, int e){
        if(s == e || e - s == 1) return true;
        if(A[s] == A[e])
            return judgeRecur(A, s + 1, e - 1);
        return false;
    }

    public static void main(String[] args) {
        char[] A = new char[]{'b','a','c','a','b'};
        char[] B = new char[]{'b','a','c','a','c'};
        System.out.println(judge(A));
        System.out.println(judge(B));
        System.out.println(judgeRecur(A, 0, 4));
        System.out.println(judgeRecur(B, 0, 4));
    }
}
