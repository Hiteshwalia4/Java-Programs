package DSA.MathProb;
import java.util.Scanner;

public class Palindrome {
    static boolean palindrome(int n){
        int temp= n;
        int rev=0;
        while (temp != 0) {
            int ld = temp % 10;
            rev= rev*10 +ld;
            temp = temp/10;
        }
        return (rev==n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        System.out.println(palindrome(n));

    }
}
