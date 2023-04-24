package DSA.Arrays;

import java.util.Arrays;

public class MoveZeroENd {
    static void movezero(int[] arr){
        int i=0;
        for (; i < arr.length ; i++)
            if (arr[i] == 0)
                break;

        int k=i, j=i+1;
        while (k < arr.length && j < arr.length) {
            if (arr[j] != 0 ) {
                int temp=arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,0,1};
        movezero(arr);
    }
}
