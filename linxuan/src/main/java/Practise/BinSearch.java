package Practise;

/**
 * Created by linxuan on 02/03/2017.
 */
public class BinSearch {



    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,5,5,6,7,8,9,9};
        System.out.println(binSearch(nums,7));
        System.out.println(binSearch(nums,4));
    }

    private static int binSearch(int[] nums, int t) {
        int s = 0, e = nums.length - 1;
        return binSearch(nums, s, e, t);
    }

    static int binSearch(int[] A, int s, int e, int t){
        if(A == null || A.length < 1 || s < 0 || e < 0) return -1;
        int l = s, h = e;
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(t < A[mid]) h = mid - 1;
            else if(t > A[mid]) l = mid + 1;
            else return mid;
        }
        return -1;
    }
}
