package GetOffer;

/**
 * Created by linxuan on 12/02/2017.
 */
public class P09Fibonacci {

    public static int fib1(int n){
        if(n <= 0) return 0;
        if(n == 1) return 1;
        return fib1(n - 2) + fib1(n - 1);
    }

    public static int fib2(int n){
        int[] result = {0,1};
        if(n < 2) return result[n];
        int minusTwo = 0;
        int minusOne = 1;
        int fibN = 0;
        for (int i = 2; i <= n; i++) {
            fibN = minusOne + minusTwo;
            minusTwo = minusOne;
            minusOne = fibN;
        }
        return fibN;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : " + fib2(i));
        }

    }
}
