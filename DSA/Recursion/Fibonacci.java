package DSA.Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n){
        if (n ==0)
            return 0;

        else if (n == 1)
            return 1;

        else
            return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms of fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series upto " + n + "th term is: ");
        for (int i = 0; i <=n ; i++) {
            System.out.print(fibo(i) + " ");
        }

    }
}
