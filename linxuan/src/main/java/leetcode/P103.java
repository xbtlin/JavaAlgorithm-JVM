package leetcode;

/**
 * Created by linxuan on 5/22/16.
 */

public class P103 {
    public static void main(String[] args) {
        System.out.println(new P103().lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; ++j) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

//    public int lengthOfLongestSubstring(String s) {
//        if(s.length() < 2) return s.length();
//        Set temp = new HashSet<String>();
//        String ret = "";
//        int maxLength = 0;
//        for (int i = 0; i < s.length(); i++) {
//            boolean check = temp.contains(Character.toString(s.charAt(i)));
//            if(!check){
//                temp.add(Character.toString(s.charAt(i)));
//                ret = ret + Character.toString(s.charAt(i));
//            }
//            else {
//                if(maxLength < ret.length()) maxLength = ret.length();
//                int j = 0;
//                while(ret.charAt(j) != s.charAt(i)){
//                    temp.remove(Character.toString(ret.charAt(j)));
//                    j++;
//                }
//                int pl = ret.indexOf(s.charAt(i));
//                ret = ret.substring(pl + 1) + s.charAt(i);
//            }
//        }
//        maxLength = Math.max(ret.length(), maxLength);
//        return maxLength;
//    }
}
