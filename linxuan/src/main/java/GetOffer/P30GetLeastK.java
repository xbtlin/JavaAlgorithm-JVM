package GetOffer;

import alogrithmsinjava.QuickSortFromBook;

/**
 * Created by linxuan on 11/02/2017.
 */
public class P30GetLeastK {

    private static void getLeastK(int[] input, int k){
        if(input == null || input.length < 1 || k < 0 || k > input.length)
            return;

        int s = 0;
        int e = input.length - 1;
        int index = QuickSortFromBook.partition(input, s, e);
        int dif = k;
        while(index != dif){
            if(index < dif){
                s = index + 1;
                index = QuickSortFromBook.partition(input, s, e);
            } else if(index > dif){
                e = index - 1;
                index = QuickSortFromBook.partition(input, s, e);
            }
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{4,5,1,6,2,7,3,8,10,0,-1};
        getLeastK(input, 5);
        for (int i = 0; i < 5; i++) {
            System.out.println(input[i]);
        }
    }
}
