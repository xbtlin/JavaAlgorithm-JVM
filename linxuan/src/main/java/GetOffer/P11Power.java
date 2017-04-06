package GetOffer;

/**
 * Created by linxuan on 19/02/2017.
 */
public class P11Power {

    public static double power(double base, int exp) throws Exception {
        if(equal(base,0.0) && exp < 0){
            throw new Exception("Input Error");
        }

        if(exp < 0) return 1.0 / power(base, Math.abs(exp));

        return powerWithUnsignExp(base, exp);
    }

    private static double powerWithUnsignExp(double base, int exp) {
        if(exp == 0){
            return 1;
        }

        if(exp == 1){
            return base;
        }

        if(exp % 2 == 0){
            return powerWithUnsignExp(base*base, exp / 2);
        } else {
            return powerWithUnsignExp(base*base, exp / 2) * base;
        }
    }

    public static boolean equal(double a, double b){
        if(Math.abs(a - b) < 0.0000001){
            return true;
        } else return false;
    }

    public static void main(String[] args) throws Exception {
//        System.out.println(power(0.5, 2));
//        System.out.println(power(0.5, 0));
//        System.out.println(power(0.5, -2));
        System.out.println(power(0.0, -2));
//        System.out.println(power(-0.5, -2));
    }
}
