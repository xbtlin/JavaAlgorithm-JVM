package GetOffer;

/**
 * Created by linxuan on 12/02/2017.
 */
public class P10NumOneInBin {

    public static int numOne(int n){
        int ct = 0;
        int flag = 1;

        while(flag > 0) {
            int k = n & flag;
            if (k > 0) ct++;
            flag <<= 1;
        }
        return ct;
    }

    public static void main(String[] args) {
        System.out.println(numOne(0));
    }
}
