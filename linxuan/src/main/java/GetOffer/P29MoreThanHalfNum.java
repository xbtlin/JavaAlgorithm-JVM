package GetOffer;

import alogrithmsinjava.QuickSort;

/**
 * Created by linxuan on 12/02/2017.
 */
public class P29MoreThanHalfNum {

    private static int moreThanHalfNum(int[] input){
        int t = input.length / 2;
        int s = 0;
        int e = input.length - 1;
        int index = QuickSort.partition(input, s, e);

        while(index != t){
            if(index < t){
                s = index + 1;
                index = QuickSort.partition(input, s, e);
            } else {
                e = index - 1;
                index = QuickSort.partition(input, s, e);
            }
        }
        return input[index];
    }

    public static void main(String[] args) {
        int[] input = new int[]{2,2,2,3,5,4,2,10,5,2,2};
        System.out.println(moreThanHalfNum(input));
    }
}
