package DSA.Sorting;

import java.util.Arrays;

public class RecBoobalSort {
    static void bubble(int[] arr, int end){
        if (end==0)
            return;

        for (int i = 0; i < end ; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubble(arr,end-1);
    }
    public static void main(String[] args) {
        int[] arr = {98,32,56,89,101,16,4};
        bubble(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
