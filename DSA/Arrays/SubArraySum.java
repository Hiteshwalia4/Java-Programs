package DSA.Arrays;

import java.util.HashMap;

public class SubArraySum {
//    No. of subarrays of sum k
    static int func(int[] nums,int n,int k ) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int count = 0;
        hm.put(0,1);
         for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            int rsum = sum - k;
            if (hm.containsKey(rsum))
                count = count + hm.get(rsum);

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

//Length of the Longest Subarray

    public static void main(String[] args) {
        int[] arr={7,1,0,6,7};
        int res=func(arr, arr.length, 7);
        System.out.println(res);
    }
}
