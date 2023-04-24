package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class A2ZHashingQues1point6 {
    static void func(int[] arr,int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el:arr)
            map.put(el,map.getOrDefault(el,0)+1);

        int maxcount=0,mincount=Integer.MAX_VALUE,maxel=-1,minel=-1;
        for(Map.Entry<Integer,Integer> e: map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(maxcount<e.getValue()){
                maxel=e.getKey();
                maxcount=e.getValue();
            }
            if(mincount>e.getValue()){
                minel=e.getKey();
                mincount=e.getValue();
            }
        }

        System.out.println("Max Frequent element is " + maxel + " with a count of " + maxcount + " time/times");
        System.out.println("Min Frequent element is " + minel + " with a count of " + mincount + " time/times");

    }

    public static void main(String[] args) {
//        int[] arr={2,3,2,3,5};
        int arr[] = {40,50,30,40,50,30,30};
        func(arr, arr.length);
//        System.out.println(Arrays.toString(arr));
    }
}
