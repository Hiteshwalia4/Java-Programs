package DSA.Arrays;

public class Prob4 {
    static int removeduplicates(int[] arr){
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[j]!=arr[i])
                j++;
                arr[j]=arr[i];
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,3,3,3,4};
        int k=removeduplicates(arr);
        for (int i = 0; i <k ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
