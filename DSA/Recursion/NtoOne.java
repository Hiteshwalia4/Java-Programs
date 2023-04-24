package DSA.Recursion;

import java.util.Scanner;

public class NtoOne {
    static int print1toN(int n) {
        if(n<=0)
            return 0;

        System.out.print(n + " ");
        return print1toN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        print1toN(n);
    }
}
