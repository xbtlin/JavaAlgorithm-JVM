package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1001 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], i + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if(m.get(sub) == null) continue;
            if(i + 1 == m.get(sub)) continue;
            if(m.get(sub) != null){
                result[0] = i + 1;
                result[1] = m.get(sub);
                break;
            }
        }
        return result;
    }

}