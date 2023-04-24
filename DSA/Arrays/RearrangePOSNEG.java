package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangePOSNEG {
    static void rearrange(int[] arr,int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg.add(arr[i]);
            } else if (arr[i] >= 0) {
                pos.add(arr[i]);
            }
        }
        for (int el: pos ) {
            System.out.print(el + " ");
        }
        System.out.println();

        for (int el: neg ) {
            System.out.print(el + " ");
        }
        System.out.println();
        int i=0,j=0;
        while(i< neg.size() && j< pos.size()){
            res.add(pos.get(j));
            j++;
            res.add(neg.get(i));
            i++;
        }
        while (j < pos.size()) {
            res.add(pos.get(j));
            j++;
        }
        while (i < neg.size()) {
            res.add(neg.get(i));
            i++;
        }
        for (int el:
                res) {
            System.out.print(el + " ");

        }

    }


    public static void main(String[] args) {
        int[] arr={9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(arr, arr.length);

        }
    }

