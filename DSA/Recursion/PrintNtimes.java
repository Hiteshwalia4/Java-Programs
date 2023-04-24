package DSA.Recursion;

import java.util.Scanner;

public class PrintNtimes {
    static void print(int i,int n,String name){
        if (i>n)
            return;

        System.out.println(name);
        print(i+1,n,name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        print(1,n,name);
    }
}
