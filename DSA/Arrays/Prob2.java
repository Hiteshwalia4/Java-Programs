package DSA.Arrays;

public class Prob2 {
    static int secondLarge(int[] arr){
        int max=0, seclarge=-1;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > arr[max])
                max=i;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=arr[max]){
                if(seclarge==-1)
                    seclarge=i;
                else if (arr[i] > arr[seclarge])
                    seclarge=i;
            }
        }
        return arr[seclarge];
    }
    public static void main(String[] args) {
        int[] arr={43,12,6,4,23};
        System.out.println("Second largest element: ");
        System.out.println(secondLarge(arr));
    }
}
