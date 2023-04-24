package DSA.MathProb;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int no_of_digits = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0){
            n= n/10;
            no_of_digits++;
        }
        System.out.println("Number of digits in the given number is/are: " + no_of_digits);

    }
}
