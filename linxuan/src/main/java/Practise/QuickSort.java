package Practise;

/**
 * Created by linxuan on 02/03/2017.
 */
public class QuickSort {



    public static void main(String[] args) {
        int[] nums = new int[]{90,1,10,3,5,7,8,2,2,2,2,11,20};
        QuickSort qs = new QuickSort();
        qs.sort(nums);
        for(int num : nums){
            System.out.print(num+", ");
        }
    }

    private void sort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private static void sort(int[] nums, int s, int e){
        if(s >= e) return;
        int k = partition(nums, s, e);
        sort(nums, s, k - 1);
        sort(nums, k + 1, e);
    }

    public static int partition(int[] A, int s, int e){
        if(A == null || A.length < 1 || s < 0 || e < 0) return -1;
        int p = s, q = e - 1, pivot = e;
        while(p <= q){
            if (A[p] <= A[pivot]) {
                ++p;
                continue;
            }
            if(A[q] >= A[pivot]){
                --q;
                continue;
            }
            swap(A, p, q);
        }
        swap(A, p, pivot);
        return p;
    }

    private static void swap(int[] A, int p, int q) {
        int tmp = A[p];
        A[p] = A[q];
        A[q] = tmp;
    }
}
