package DSA.MathProb;

import java.util.Scanner;

public class Divisors {
    static void divisors(int n){
        int i;
        for ( i = 1; i*i < n ; i++)
            if (n % i == 0)
                System.out.print(i + " ");

        for ( ; i >=1 ; i--)
            if (n % i == 0)
                System.out.print(n/i + " ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Divisors of Entered number are: ");
        divisors(n);
//        for (int i = 1; i*i <= n ; i++) {
//            if (n % i == 0) {
//                System.out.print(i + " ");
//                if (i != n/i)
//                    System.out.print(n/i + " ");
//            }
//        }
    }
}
