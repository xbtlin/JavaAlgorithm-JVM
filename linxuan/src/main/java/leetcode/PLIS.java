package leetcode;

/**
 * Created by linxuan on 05/02/2017.
 */
public class PLIS {
    static int[] p = new int[]{0,1,7,3,5,9,4,8};
    static int[] b = new int[10];
    static int[] c = new int[10];
//    static int LIS(int[] arr, int n)
//    {
//        for(int i=1; i<=n; ++i)
//            dp[i] = 0;
//        int ans;
//        dp[1] = 1;
//        for(int i=2; i<=n; ++i)
//        {
//            ans = dp[i];
//            for(int j=1; j<i; ++j)
//            {
//                if(arr[i]>arr[j] && dp[j]>ans)
//                    ans = dp[j];
//            }
//            dp[i] = ans+1;
//        }
//        ans = 0;
//        for(int i=1; i<=n; ++i)
//        {
//            if(dp[i] > ans)
//                ans = dp[i];
//        }
//        return ans;
//    }

    // Author: Tanky Woo
// Blog: www.WuTianQi.com
// num为要查找的数,k是范围上限
// 二分查找大于num的最小值，并返回其位置
    static int bSearch(int num, int k)
    {
        int low=1, high=k;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(num>=b[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }

    static int LIS(int n)
    {
        int low = 1, high = n;
        int k = 1;
        b[1] = p[1];
        for(int i=2; i<=n; ++i)
        {
            if(p[i]>=b[k]) {
                b[++k] = p[i];

            }

            else
            {
                int pos = bSearch(p[i], k);
                b[pos] = p[i];
            }
        }
        int t = k;
        k = 1;
        for (int i = 0; i < b.length; i++) {
            b[i] = 0;
        }
        b[1] = p[1];
        for(int i=2; i<=n; ++i)
        {
            if(p[i]>=b[k]) {
                b[++k] = p[i];
                if(k == t){
                    for (int j = 0; j < b.length; j++) {
                        c[j] = b[j];
                    }
                }
            }
            else
            {
                int pos = bSearch(p[i], k);
                b[pos] = p[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{0,4,5,6,1,5,9,4,8};
//        System.out.println(PLIS.LIS(arr,arr.length-1));
        System.out.println(PLIS.LIS(p.length-1));
        for(int i : c){
            System.out.print(i + " ");
        }
    }
}
