package DSA.Arrays;

public class Prob1{
    static int maxel(int[] arr,int n){
        int max=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max)
                max=arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] arr={12,134,1,2,4,5};
//        int[] arr = {1,7,8,56,90};
        int[] arr = {1};
        System.out.println(maxel(arr,6));
    }
}
