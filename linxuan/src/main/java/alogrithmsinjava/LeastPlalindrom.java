package alogrithmsinjava;

/**
 * Created by linxuan on 20/03/2017.
 */
public class LeastPlalindrom {

    static int least(int[] A, int n){
        if(A == null || A.length < 1) return -1;
        int s = 0, e = n - 1, k = 0;
        while(s < e){
            if(A[s] == A[e]){
                ++s;
                --e;
            } else if(A[s] < A[e]){
                A[++s] += A[s - 1];
                ++k;
            } else{
                A[--e] += A[e + 1];
                ++k;
            }
        }
        return k;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()) {
//            System.out.println(scanner.nextInt());
//        }
        int[] A = new int[]{1,1,1,5,2,3,3};
        System.out.println(least(A,7));

    }
}
