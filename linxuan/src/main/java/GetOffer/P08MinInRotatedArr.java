package GetOffer;

/**
 * Created by linxuan on 12/02/2017.
 */
public class P08MinInRotatedArr {

    private static int minInRotatedArr(int[] A){
        int s = 0, e = A.length - 1;
        while(s <= e){
            if(e - s == 1) return e;
            int mid = s + (e - s) / 2;
            if(A[mid] > A[s]){
                s = mid;
            } else if(A[mid] < A[s]){
                e = mid;
            } else {
                if(A[mid] > A[mid - 1]){
                    e = mid;
                } else {
                    s = mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{3,1,3,3,3};
        System.out.println(minInRotatedArr(input));
    }
}
