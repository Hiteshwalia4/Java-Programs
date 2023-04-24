package DSA.Arrays;

public class Sort012 {
    static void sort(int[] arr,int n){
        int count0=0,count1=0,count2=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==0)
                count0++;
            else if (arr[i]==1)
                count1++;
            else
                count2++;
        }

    }
}
