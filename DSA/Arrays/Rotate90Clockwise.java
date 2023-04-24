package DSA.Arrays;

import java.util.Arrays;

public class Rotate90Clockwise {
    static void rotate(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++) {
            for (int j = i+1; j < n; j++) {
                int temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < n ; i++) {
            int temp2=matrix[i][0];
            matrix[i][0]=matrix[i][n-1];
            matrix[i][n-1]=temp2;
        }

        System.out.println(Arrays.deepToString(matrix));
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
//        System.out.println(Arrays.deepToString(arr));
    }
}
