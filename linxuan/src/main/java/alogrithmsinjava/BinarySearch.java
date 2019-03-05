package alogrithmsinjava;

/**
 * Created by linxuan on 03/01/2017.
 */
public class BinarySearch {
    public int bs(int t, int[] nums){
        int min,max,mid;
        min=0;
        // notice that max = nums.length also works well
        max=nums.length - 1;
//        max=nums.length;
        while(min<=max){
            mid = min + (max - min)/2;
            if(nums[mid] < t) min = mid + 1;
            else if(nums[mid] > t) max = mid - 1;
            else return mid;
        }
        return 0;
    }

    public int binSearch(int t, int[] nums){
        int l = 0,r = nums.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(t == nums[mid]) return mid;
            else if(t < nums[mid]){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public int bsearch(int[] a, int e, int n){
        if(a == null || n <= 0) return -1;
        int l = 0, h = n - 1;
        while (l <=h){
            int mid=l+(h-l)/2;
            if(a[mid] < e) l = mid + 1;
            else if(a[mid] > e) h = mid - 1;
            else return mid;
        }
        return -1;
    }

    public int bsearch201903(int[] a, int e, int n) {
        if(a == null || n <= 0) return -1;
        int l = 0, h = n - 1;
        while(l <= h) {
            int mid = l + (h - l)/2;
            if(a[mid] == e) return mid;
            else if(a[mid] > e) h = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,7,8,8,123,456,823,1024,1024};
        for (int i : nums){
            System.out.println(new BinarySearch().bsearch201903(nums,i,nums.length));
        }

//        for (int a : nums) {
//            System.out.println(new BinarySearch().bs(a,nums));
//        }
//        System.out.println(new BinarySearch().binSearch(8,nums));
    }
}
