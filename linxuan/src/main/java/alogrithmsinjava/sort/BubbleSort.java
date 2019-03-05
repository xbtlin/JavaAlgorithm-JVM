package alogrithmsinjava.sort;

/**
 * Created by linxuan on 12/02/2017.
 */
public class BubbleSort {
    public static void bubblesort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(a[i] > a[j]) swap(a, i, j);
            }
        }
    }

    public static void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,1,10,3,5,7,8,2,2,2,2,11,10};
        int[] a = new int[]{1,2,3,4,6,2,5,7,8,9};
        BubbleSort ms = new BubbleSort();
        ms.bubblesort(a, a.length);
        for(int num : a){
            System.out.print(num+", ");
        }
    }
}
