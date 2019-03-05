package alogrithmsinjava;

/**
 * Created by linxuan on 20/06/2018.
 */
public class ReverseString {

    void reverseString(String a){
        String[] arr=a.split("\\s");
        for(int i = arr.length-1; i >=0; i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        new ReverseString().reverseString("the house is blue");
    }
}
