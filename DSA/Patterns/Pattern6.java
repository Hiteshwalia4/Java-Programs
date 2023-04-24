package DSA.Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = sc.nextInt();

        for (int i =m; i>0; i--){
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
