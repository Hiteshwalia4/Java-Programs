package DSA.Recursion;
import java.util.Scanner;

public class OnetoN {
    static void print(int i,int n){
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        print(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        print(1,n);
    }
}
