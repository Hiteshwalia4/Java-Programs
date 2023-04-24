package DSA.MathProb;

import java.util.Scanner;
//Normal Approach
public class GCD {
//   static int gcd(int a ,int b){
//        int res = Math.min(a,b);
//       while (res > 0) {
//           if (a % res == 0 && b % res == 0) {
//               break;
//           }
//           res--;
//       }
//       return res;
//
//    }

//Eucledian Approach
//    static int gcd(int x ,int y){
//        while (x != y) {
//            if (x > y)
//                x=x-y;
//            else
//                y=y-x;
//        }
//        return x;
//    }

//Optimized Eucledian Approach
    static int gcd(int a ,int b){
        if (b == 0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int first = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int second = sc.nextInt();

        int var= gcd(first,second);
        System.out.println("GCD of entered numbers is: " + var);
    }
}

