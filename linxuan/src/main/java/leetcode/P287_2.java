package leetcode;

/**
 * Created by linxuan on 26/02/2017.
 */
public class P287_2 {
    public int findMissOne(int[] num){
        int l = 1, h = num.length+1;
        while(l < h){
            int mid = l + (h - l) / 2;
            int cnt = 0;
            for(int i : num){
                if(i <= mid) cnt++;
            }
            if(cnt < mid) h = mid;
            else l = mid + 1;
        }
        return h;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6,1,4,3,2,5,8};
        P287_2 obj = new P287_2();
        System.out.println(obj.findMissOne(nums));
    }
}
