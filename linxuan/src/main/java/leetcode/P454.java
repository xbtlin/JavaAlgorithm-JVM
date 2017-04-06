package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by linxuan on 26/12/2016.
 */
public class P454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int N = A.length;

        int ct = 0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int a : A){
            for(int b : B){
                map.put(a+b,(map.get(a+b)!=null ? map.get(a+b) : 0)+1);
            }
        }

        for(int c : C){
            for(int d : D){
                ct += (map.get(-(c+d)) != null ? map.get(-(c+d)) : 0);
            }
        }

        return ct;
    }





//    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
//        int N = A.length;
//
//        int ct = 0;
//        for(int a : A){
//            for(int b : B){
//                for(int c : C){
//                    for(int d : D){
//                        if(a + b + c + d == 0) ++ct;
//                    }
//                }
//            }
//        }
//        return ct;
//    }

//    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
//        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
//
//        for(int i=0; i<C.length; i++) {
//            for(int j=0; j<D.length; j++) {
//                int sum = C[i] + D[j];
//                map.put(sum, map.getOrDefault(sum, 0) + 1);
//            }
//        }
//
//        int res=0;
//        for(int i=0; i<A.length; i++) {
//            for(int j=0; j<B.length; j++) {
//                res += map.getOrDefault(-1 * (A[i]+B[j]), 0);
//            }
//        }
//
//        return res;
//    }

    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {-2,-1,0};
        int[] C = {-1,2,0};
        int[] D = {0,2,0};

        System.out.println(new P454().fourSumCount(A,B,C,D));
    }
}
