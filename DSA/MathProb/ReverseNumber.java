package DSA.MathProb;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse= reverse*10 + lastDigit;
            temp = temp / 10;
        }
        System.out.println("Reverse of a Number is: " + reverse);
 }
}
