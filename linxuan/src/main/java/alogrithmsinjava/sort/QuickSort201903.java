package alogrithmsinjava.sort;

/**
 * Created by linxuan on 15/01/2017.
 */
public class QuickSort201903 {

    public static void sort(int[] a, int s, int e){
        if(a == null || s > e) return;
        int pivot = partition(a, s, e);
        sort(a, s, pivot - 1);
        sort(a, pivot + 1, e);
    }

    public static int partition(int[] a, int s, int e){
        if(s > e) return s; // ?
        int pivot = e;
        int p = s, q = e - 1;
        while(p <= q){
            if(a[p] <= a[pivot]){
                ++p;
                continue;
            }
            if(a[q] >= a[pivot]){
                --q;
                continue;
            }
            swap(a, p, q);
        }
        swap(a, p, pivot);
        return p;
    }

    private static void swap(int[] nums, int s, int e) {
        int tmp = nums[s];
        nums[s] = nums[e];
        nums[e] = tmp;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{9,1,10,3,5,7,8,2,2,2,2,9,11};
        int[] nums=new int[]{7,3,1,5,6,8,9,5};
        QuickSort201903 qs = new QuickSort201903();
        qs.sort(nums, 0, nums.length - 1);
        for(int num : nums){
            System.out.print(num+", ");
        }
    }
}
