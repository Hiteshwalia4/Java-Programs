package DSA.Arrays;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProb {
    static int[] twosum(int[] arr,int target,int n){
        int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            if(map.containsKey(target-arr[i])){
                res[1]=i;
                res[0]=map.get(target-arr[i]);
            }
            map.put(arr[i],i);
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target = 6;
        int[] res=twosum(arr,target, arr.length);
        System.out.println(Arrays.toString(res));
    }

}
