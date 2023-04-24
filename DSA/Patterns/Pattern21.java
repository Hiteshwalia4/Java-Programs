package DSA.Patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        int length = sc.nextInt();

        System.out.println("Enter breadth of rectangle : ");
        int breadth = sc.nextInt();

        for (int i = 1; i <= length ; i++) {
            for (int j = 1; j <= breadth; j++) {
                if ( j==1 || j==breadth || i==1 || i==length  ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
