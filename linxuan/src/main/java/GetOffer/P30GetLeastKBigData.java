package GetOffer;

import java.util.TreeSet;

/**
 * Created by linxuan on 12/02/2017.
 */
public class P30GetLeastKBigData {


    private static void getLeastK(int[] input, TreeSet<Integer> leastK, int k){
        for (int i = 0; i < input.length; i++) {
            if(leastK.size() < k) leastK.add(input[i]);
            else if(leastK.last() > input[i]){
                leastK.remove(leastK.last());
                leastK.add(input[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{4,5,1,6,2,7,3,8,10};
        TreeSet<Integer> leastK = new TreeSet<Integer>();
        getLeastK(input, leastK, 4);
        for(Integer i : leastK){
            System.out.println(i);
        }
    }
}
