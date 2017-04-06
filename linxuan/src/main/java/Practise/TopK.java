package Practise;

/**
 * Created by linxuan on 08/03/2017.
 */
public class TopK {
    public static void main(String[] args) {
        int[] nums = new int[]{90,1,10,3,5,7,8,2,2,11,20};
        int k = 5;
        topK(nums, nums.length, k);

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void topK(int[] A, int n, int k) {
        if(A == null || A.length < 1 || k < 1 || k > n) return;
        topK(A, 0, n - 1, k);
    }

    private static void topK(int[] A, int s, int e, int k){
        int t = QuickSort.partition(A, s, e);
        if(t < k)
            topK(A, t + 1, e, k);
        else if(t > k)
            topK(A, s, t - 1, k);
        else
            return;
    }
}
