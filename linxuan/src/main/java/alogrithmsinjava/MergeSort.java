package alogrithmsinjava;

/**
 * Created by linxuan on 12/02/2017.
 */
public class MergeSort {
    public static void merge(int[] a, int lo, int hi, int mid){
        int i = lo;
        int j = mid + 1;
        int[] tmp = new int[a.length];
        for(int k = lo; k <= hi; k++){
            tmp[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if(i > mid) a[k] = tmp[j++];
            else if(j > hi) a[k] = tmp[i++];
            else if(tmp[i] < tmp[j]) a[k] = tmp[i++];
            else a[k] = tmp[j++];
        }
    }

    public static void sort(int[] a, int lo, int hi){
        if(lo >= hi) return;
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, hi, mid);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,1,10,3,5,7,8,2,2,2,2,11,10};
        int[] a = new int[]{1,2,3,4,6,2,5,7,8,9};
        MergeSort ms = new MergeSort();
        ms.sort(a, 0, a.length - 1);
        for(int num : a){
            System.out.print(num+", ");
        }
    }
}
