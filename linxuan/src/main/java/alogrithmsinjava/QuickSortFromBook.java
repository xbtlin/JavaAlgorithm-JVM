package alogrithmsinjava;

/**
 * Created by linxuan on 11/02/2017.
 */
public class QuickSortFromBook {
    public static void sort(int [] a){
        sort(a,0,a.length - 1);
    }

    private static void sort(int[] a, int lo, int hi){
        if(hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    public static int partition(int[] a, int lo, int hi){
        int i = lo, j = hi + 1;
        int v = a[lo];
        while(true){
            while(a[++i] < v) if (i == hi) break;
            while(v < a[--j]) if (j == lo) break;
            if (i >= j) break;
            swap(a, i, j);
        }
        swap(a, lo, j);
        return j;
    }

    private static void swap(int[] nums, int s, int e) {
        int tmp = nums[s];
        nums[s] = nums[e];
        nums[e] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,9,2,10,3,5,7,8};
        QuickSortFromBook qs = new QuickSortFromBook();
        qs.sort(nums);
        for(int num : nums){
            System.out.print(num+", ");
        }
    }
}
