package leetcode;

/**
 * Created by linxuan on 01/01/2017.
 */
public class P287 {
    public int findDuplicate(int[] nums) {
        int a;
        for (int i = 0; i < nums.length - 1; i++) {
            a = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(a == nums[j]) return a;
            }
        }
        return 0;
    }

    public int findDuplicate2(int[] nums){
        int l = 1, r = nums.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            int ct = 0;
            for(int num : nums){
                if(num <= mid) ++ct;
            }
            if(ct <= mid){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }



    public int findDuplicate4(int[] num){
        int l = 1, h = num.length - 1;
        while(l < h){
            int mid = l + (h - l) / 2;
            int cnt = 0;
            for(int i : num){
                if(i <= mid) cnt++;
            }
            if(cnt > mid) h = mid;
            else l = mid + 1;
        }
        return h;
    }

    /**
     * http://bookshadow.com/weblog/2015/09/28/leetcode-find-duplicate-number/
     */
    public int findDuplicate3(int[] nums){
        int slow = 0, fast = 0;
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                break;
            }
        }
        int finder = 0;
        while(true){
            slow = nums[slow];
            finder = nums[finder];
            if(slow == finder) return slow;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,1,10,3,5,7,8,2,4,6,2};
//        int[] nums = new int[]{6,1,4,3,2,5,3};
        P287 obj = new P287();
        System.out.println(obj.findDuplicate(nums));
        System.out.println(obj.findDuplicate2(nums));
        System.out.println(obj.findDuplicate3(nums));
        System.out.println(obj.findDuplicate4(nums));
    }
}
