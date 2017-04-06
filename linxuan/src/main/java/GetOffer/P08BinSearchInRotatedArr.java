package GetOffer;

/**
 * Created by linxuan on 10/03/2017.
 * 旋转数组上的二分查找
 */
public class P08BinSearchInRotatedArr {
    public static void main(String[] args) {
        int[] input = new int[]{7,7,7,7,7,7,7,2,3,4,5,6,7};
        for (int i = 0; i < 10; i++) {
            System.out.println(BinSearchInRotatedArr(input, i));
        }
    }

    private static int BinSearchInRotatedArr(int[] A, int k) {
        int s = 0, e = A.length - 1;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(k == A[m]) return m;
            else if(A[m] >= A[s]){
                if (k < A[m] && k >= A[s]){
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else if(A[m] <= A[e]){
                if (k > A[m] && k <= A[e]){
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}
