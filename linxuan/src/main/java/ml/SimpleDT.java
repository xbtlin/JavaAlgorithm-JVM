package ml;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by linxuan on 9/8/16.
 */
public class SimpleDT {

    public static double mylog(double value, double base) {
        if(base < 0 || value < 0) return -1;
        return Math.log(value) / Math.log(base);
    }

    public static double myformat(double value, int scale){
        return new BigDecimal(value).setScale(scale,RoundingMode.UP).doubleValue();
    }

    public static double entropyOfDataSet(int[] D, double D_capacity){
        double H = 0;
        for(int Di : D){
            H -= (Di / D_capacity) * mylog(Di / D_capacity, 2);
        }
        return myformat(H,3);
    }

    public static void main(String[] args) {
        double HD = entropyOfDataSet(new int[]{6,9},15);
        double HD1 = entropyOfDataSet(new int[]{2,3},5);
        double HD2 = HD1;
        double HD3 = entropyOfDataSet(new int[]{1,4},5);
        double HDage = myformat(5.0/15*HD1 + 5.0/15*HD2 + 5.0/15*HD3,3);
        double gainDAage = myformat(HD - HDage,3);
        System.out.println(gainDAage);
    }
}
