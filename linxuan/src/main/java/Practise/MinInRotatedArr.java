package Practise;

/**
 * Created by linxuan on 11/03/2017.
 */
public class MinInRotatedArr {
    public static void main(String[] args) {
        int[] input = new int[]{7,8,9,10,11,1,2,3,4,5,6};
//        int[] input = new int[]{3,1,3,3,3};
        System.out.println(minInRotatedArrFromBook(input));
    }

    private static int minInRotatedArr(int[] A) {
        int s = 0, e = A.length - 1;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(s == e) return m;
            if(A[m] < A[e]){
                if(m - 1 >=0 && A[m] >= A[m - 1]){
                    e = m - 1;
                } else {
                    return m;
                }
            } else if(A[m] > A[e]){
                s = m + 1;
            } else if(A[m] == A[s]){
                s = m + 1;
            }
        }
        return -1;
    }

    private static int minInRotatedArrFromBook(int[] A){
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
}
