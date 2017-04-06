package GetOffer;

/**
 * Created by linxuan on 22/02/2017.
 */
public class P14ChangeOrder {

    public static void changeOrder(int[] A, int n){
        int p = 0, q = n - 1;
        while(p < q){
            if(A[p] % 2 == 1){
                ++p;
                continue;
            }
            if(A[q] % 2 == 0){
                --q;
                continue;
            }
            swap(A, p, q);
        }
    }

    static void swap(int[] A, int p, int q){
        int tmp = A[p];
        A[p] = A[q];
        A[q] = tmp;
    }
    public static void main(String[] args) {
        int[] A = new int[]{2,3,9,4,6,12,11,8,1,5,7,3};
        changeOrder(A,A.length);
        for(int i : A){
            System.out.print(i + " ");
        }
    }
}
