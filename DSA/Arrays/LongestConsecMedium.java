package DSA.Arrays;

import java.util.HashSet;

public class LongestConsecMedium {
    static void longest(int[] nums,int n){
        HashSet<Integer> set = new HashSet<>();
        for (int el: nums)
            set.add(el);

        System.out.println(set);
        for (int i = 0; i <set.size() ; i++) {
//            if(set.contains(set[i]) )
        }
//        return 0;


    }

    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,4,5,6,7,8,10};
        longest(arr, arr.length);
    }

}
