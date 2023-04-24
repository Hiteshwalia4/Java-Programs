package DSA.Patterns;

import java.util.Scanner;
// INCOMPLETE
public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of levels of small pyramids forming a diamond: ");
        int n = sc.nextInt();

        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 2*(n-i) ; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 2*(n-i) ; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
