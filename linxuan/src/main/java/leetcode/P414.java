package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by linxuan on 24/12/2016.
 */
public class P414 {
    public int thirdMax(int[] nums) {
        List<Integer> l = new ArrayList<Integer>(4);

        for (int i = 0; i < nums.length; i++) {
            if(l.contains(nums[i])) continue;
            l.add(nums[i]);
            Collections.sort(l);
            if(l.size() > 3) l.remove(0);
        }

        if(l.size() < 3) return l.get(l.size() - 1);
        return l.get(0);
    }

//    public int thirdMax(int[] nums) {
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//        Set<Integer> set = new HashSet<Integer>();
//        for (int i : nums) {
//            if (!set.contains(i)) {
//                pq.offer(i);
//                set.add(i);
//                if (pq.size() > 3) {
//                    set.remove(pq.poll());
//                }
//            }
//        }
//        if (pq.size() < 3) {
//            while (pq.size() > 1) {
//                pq.poll();
//            }
//        }
//        return pq.peek();
//    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        int r = new P414().thirdMax(nums);
        System.out.println(r);
        System.out.println(Integer.MIN_VALUE);
    }
}
