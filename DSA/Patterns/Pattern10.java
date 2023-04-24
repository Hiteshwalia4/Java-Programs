package DSA.Patterns;

import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i = 0 ; i<n ; i++){
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n-1; i > 0 ; i--) {
            for(int j=0 ; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}