package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateArray {
//    static void rightrotate(int[] arr,int k,int n){
//        for (int i = 0; i <k ; i++) {
//            int temp=arr[n-1];
//            for (int j = n-2; j >=0 ; j--) {
//                arr[j+1]=arr[j];
//            }
//            arr[0]=temp;
//        }
//    }
    static void rightrotate(int[] arr,int k,int n){
        k=k%n;
        swap(arr,0,k);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int low,int k ){
        int tempK=k+1;
        while (low != k) {
            int temp= arr[low];
            arr[low]=arr[tempK];
            arr[tempK]=temp;
            low++;
            tempK++;
        }
        int temp2=arr[k];
        for (int i = k; i < arr.length-1 ; i++)
            arr[i]=arr[i+1];
        arr[arr.length-1]=temp2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        System.out.print("Enter number of steps upto which you want to right rotate array: ");
        int k = sc.nextInt();
        rightrotate(arr,k,arr.length);
    }
}
