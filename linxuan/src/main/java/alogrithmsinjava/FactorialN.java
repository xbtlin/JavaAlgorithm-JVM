package alogrithmsinjava;

import java.math.BigDecimal;

/**
 * Created by linxuan on 21/03/2017.
 */
public class FactorialN {
    static BigDecimal fact(int N){
        BigDecimal r = new BigDecimal(1);
        for (int i = 1; i <= N; i++) {
            r = r.multiply(new BigDecimal(i));
        }
        return r;
    }

    public static void main(String[] args) {

        System.out.println(fact(1000));
    }
}
