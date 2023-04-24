package DSA.Sorting;

import java.util.Arrays;

public class RecInsertionSort {
    static void insertion(int[] arr, int n){
        if (n <= 1)
            return;

        insertion(arr,n-1);
        int key = arr[n-1];
        int j = n-2;
        while (j>=0 && arr[j] > key ){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
    public static void main(String[] args) {
        int[] arr = {69,43,104,2,45};
        insertion(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
