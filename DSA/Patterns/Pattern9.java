package DSA.Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i+=2){
            for (int k=i;k<n;k++){
                System.out.print(" ");
            }
            for (int j= 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=n; i>0;i-=2){
            for(int k=i; k<=n; k++){
                System.out.print(" ");
            }
            for (int j = 0; j <i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
