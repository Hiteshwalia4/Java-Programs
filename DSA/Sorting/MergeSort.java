package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    static void mergesort(int[] arr, int l, int r  ){
        if(r > l){
            int m = l + (r - l)/2;
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    static void merge(int[] arr,int l, int m, int r ){
        int n1 = m - l + 1;
        int n2 = r - m ;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i <left.length ; i++)
            left[i] = arr[l + i];

        for (int i = 0; i <right.length ; i++)
            right[i] = arr[m + i + 1];


        int i=0,j=0,k=l;
        while ( i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
                arr[k] = left[i];
                k++;
                i++;
        }

        while(j< n2){
                arr[k] = right[j];
                k++;
                j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {50,32,51,4,100,69};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}