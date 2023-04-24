package DSA.Sorting;

import java.util.Arrays;

public class HoareQsort {
    static int Hpartition(int[] ar, int l, int h){
        int pivot = ar[l];
        int i = l-1;
        int j = h+1;
        while (true){
            do {
                i++;
            }while (ar[i] < pivot);

            do {
                j--;
            }while (ar[j] > pivot);

            if (i >= j)
                return j;

            int temp = ar[j];
            ar[j] = ar[i];
            ar[i] = temp;
        }
    }
    static void qsort(int[] arr,int l,int h){
        if(l < h){
            int p = Hpartition(arr,l,h);
            qsort(arr,l,p);
            qsort(arr,p+1,h);
        }
    }

    public static void main(String[] args) {
//        int[] arr = {8,2,1,14,12,34,56};
        int[] arr = {13,9,10};
        qsort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
