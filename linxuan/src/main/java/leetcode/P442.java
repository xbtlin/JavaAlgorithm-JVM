package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linxuan on 24/12/2016.
 */
public class P442 {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums == null || nums.length < 0)
            return null;
        List<Integer> r = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i]) - 1] < 0){
                r.add(Math.abs(nums[i]));
            } else {
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            }
        }
        return r;
    }


    public static void main(String[] args) {
        int[] nums = {8,3,2,7,8,2,3,1};
        List<Integer> r = new P442().findDuplicates(nums);
        for(Integer a : r){
            System.out.println(a);
        }
    }
}
