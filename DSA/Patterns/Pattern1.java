package DSA.Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int m = sc.nextInt();
        System.out.println("Enter columns: ");
        int n = sc.nextInt();

        for (int i =0; i< m; i++){
            for (int j = 0; j < n ; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
