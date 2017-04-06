package leetcode;

/**
 * Created by linxuan on 14/01/2017.
 * The answer is between maximum value of input array numbers and sum of those numbers.
 Use binary search to approach the correct answer. We have l = max number of array; r = sum of all numbers in the array;Every time we do mid = (l + r) / 2;
 Use greedy to narrow down left and right boundaries in binary search.
 3.1 Cut the array from left.
 3.2 Try our best to make sure that the sum of numbers between each two cuts (inclusive) is large enough but still less than mid.
 3.3 We'll end up with two results: either we can divide the array into more than m subarrays or we cannot.
 If we can, it means that the mid value we pick is too small because we've already tried our best to make sure each part holds
 as many non-negative numbers as we can but we still have numbers left. So, it is impossible to cut the array into m parts and
 make sure each parts is no larger than mid. We should increase m. This leads to l = mid + 1;
 If we can't, it is either we successfully divide the array into m parts and the sum of each part is less than mid, or
 we used up all numbers before we reach m. Both of them mean that we should lower mid because we need to find the minimum one. This leads to r = mid - 1;
 */
public class P410 {

    public int splitArray(int[] nums, int m) {
        long max=0,sum = 0;
        for(int num : nums){
            max = Math.max(max, num);
            sum += num;
        }
        long l = max, r = sum;
        while(l <= r){
            long mid = (l + r) / 2;
            if(valid(mid,nums,m)){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int)l;
    }

    private boolean valid(long mid, int[] nums, int m) {
        long total = 0;
        int ct = 1;
        for(int num : nums) {
            total += num;
            if (total > mid) {
                ++ct;
                total = num;
            }
            if(ct > m){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,2,5,10,8};
        System.out.println(new P410().splitArray(nums,3));
    }
}
