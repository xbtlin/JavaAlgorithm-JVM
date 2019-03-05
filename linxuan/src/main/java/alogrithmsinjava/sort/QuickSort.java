package alogrithmsinjava.sort;

/**
 * Created by linxuan on 15/01/2017.
 */
public class QuickSort {

    public void sort(int[] nums){
        sort(nums,0,nums.length - 1);
    }

    private void sort(int[] nums, int s, int e) {
        if(e<=s) return;
        int p = partition(nums, s, e);
        sort(nums,s,p-1);
        sort(nums,p+1,e);
    }

    public static int partition(int[] nums, int s, int e){
        int p = s, q = e - 1, pivot = e;
        while(p <= q){
            if(nums[p] <= nums[pivot]) {
                ++p;
                continue;
            }
            if(nums[q] >= nums[pivot]) {
                --q;
                continue;
            }
            swap(nums, p, q);
        }
//        if(nums[p] > nums[pivot]) {
//            swap(nums, p, pivot);
//            return p;
//        }
//        else return pivot;
            swap(nums, p, pivot);
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
        QuickSort qs = new QuickSort();
        qs.sort(nums);
        for(int num : nums){
            System.out.print(num+", ");
        }
    }
}
