package GetOffer;

/**
 * Created by linxuan on 12/02/2017.
 */
public class P28StringPermutation {

    public static void permutation(char[] input){
        permutation(input, 0, input.length - 1);
    }

    public static void permutation(char[] input, int lo, int hi){
        if(lo == hi){
            System.out.println(input[lo]);
        } else {
            for (int i = lo; i < hi; ++i) {
                swap(input, lo, i);
                permutation(input, i + 1, hi);
                swap(input, lo, i);
            }
        }
    }

    private static void swap(char[] nums, int s, int e) {
        char tmp = nums[s];
        nums[s] = nums[e];
        nums[e] = tmp;
    }

    public static void main(String[] args) {
        char[] input = new char[]{'a','b','c'};
        permutation(input);
    }
}
