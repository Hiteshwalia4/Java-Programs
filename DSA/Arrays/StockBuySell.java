package DSA.Arrays;

public class StockBuySell {
    static int maxprofitday(int[] arr,int n){
        int maxProfit=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            if (arr[i] < min)
                min=arr[i];
                maxProfit = Math.max(arr[i] - min, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxprofitday(arr, arr.length));
    }
}
