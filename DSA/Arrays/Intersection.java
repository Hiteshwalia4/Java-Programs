package DSA.Arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class Intersection {
    static TreeSet<Integer> intersect(int[] arr1,int[] arr2,int n,int m){
        TreeSet<Integer> s =new TreeSet<>();
        int i=0,j=0;
        while (i < n && j < m) {
            if(arr1[i] < arr2[j])
                i++;
            else if (arr1[i] > arr2[j])
                j++;
            else {
                s.add(arr1[i]);
                j++;
                i++;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr ={2,3,4,4,4,7,21};
        int[] arr2 ={2,3,3,3,4,4,5,5,5};
        TreeSet<Integer> tl=intersect(arr,arr2, arr.length, arr2.length);
        for (int el:tl
             ) {
            System.out.print(el +" ");
        }

    }
}
