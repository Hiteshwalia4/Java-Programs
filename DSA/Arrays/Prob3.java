package DSA.Arrays;

import java.util.HashSet;

public class Prob3 {
    HashSet<Integer> set = new HashSet<Integer>();

    static boolean isSorted(int[] arr,int n){
        // code here
        if(n==1)
            return true;
        for(int i = 0 ;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,22,3,4,5};
        System.out.println(isSorted(arr, arr.length));
    }
}

