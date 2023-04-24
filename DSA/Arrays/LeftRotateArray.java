package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
    static void leftrotate(int[] arr,int k,int n){
        for (int i = 0; i <k ; i++) {
            int temp=arr[0];
            for (int j = 0; j <n-1 ; j++) {
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        System.out.print("Enter number of steps upto which you want to left rotate array: ");
        int k = sc.nextInt();
        leftrotate(arr,k,arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
