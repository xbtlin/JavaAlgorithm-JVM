package leetcode;

import java.util.*;

/**
 * Created by linxuan on 5/20/16.
 */
public class P347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums){
            Integer freq = map.get(i);
            map.put(i, freq==null ? 1 : freq + 1);
        }
        List<Map.Entry<Integer,Integer>> list =
                new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        list.subList(k,list.size()).clear();
        List<Integer> list2 = new ArrayList<Integer>();
        for(Map.Entry entry : list){
            list2.add((Integer) entry.getKey());
        }
        return list2;
    }

    public static void main(String[] args) {
        P347 obj = new P347();
        int[] test = new int[]{1,4,4,4,4,6,6,6,6,6,1,1,2,2,3,3,3};
        List<Integer> list = obj.topKFrequent(test,5);
        for(Integer i : list){
            System.out.println(i);
        }
    }
}
