package DSA.Sorting;

import java.util.Arrays;

public class LomutoQsort {
    static int partition(int[] ar, int l,int h){
        int pivot = ar[h];
        int i = l-1;
        for (int j = l; j <h ; j++)
            if (ar[j] < pivot){
                i++;
                int temp = ar[j];
                ar[j] = ar[i];
                ar[i]= temp;
            }

        int tem = ar[i+1];
        ar[i+1] = ar[h];
        ar[h] = tem;
        return (i+1);
    }
    static void quicksort(int[] ar,int l,int h) {
        if (l < h) {
            int p = partition(ar, l, h);
            quicksort(ar, l, p - 1);
            quicksort(ar, p + 1, h);
        }
    }
    public static void main(String[] args) {
        int[] arr = {66,12,43,5,23,33,33,30};
//        int[] arr ={9,2,1};
        quicksort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
