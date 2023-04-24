//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
import java.util.Scanner;

public class Rough {
    static long power(int N, int R) {
        //Your code here
        long res = poww(N, R);
        System.out.println(res);
        return res % 1000000007;

    }

    static long poww(long x, long n) {
        if (n == 0) return 1;
        else if (n % 2 == 0) return poww(x * x, n / 2);
        return x * poww(x, n - 1);
    }

//    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
//    {
//        // add your code here
//        ArrayList<Integer> res = new ArrayList<>();
//        HashSet<Integer> h = new HashSet<>(n+m);
//        for(int i=0;i<n;i++)
//            h.add(arr1[i]);
//
//        for(int i=0;i<m;i++)
//            h.add(arr2[i]);
//
//        for(int el: h)
//            res.add(el);
//
//        Collections.sort(res);
//        return res;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rno=sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        float marks=sc.nextFloat();
        System.out.println(rno + name + marks);
//        int[] arr ={2,4,3,73,21};
//        long val = power(12, 21);
//        System.out.println(val);
//        int[] arr2 ={2,4,3,32,1011,45,67};
//        ArrayList<Integer> al = findUnion(arr,arr2, arr.length, arr2.length );
//        for (int el: al) {
//            System.out.print(el + " ");
//        }
//        int i=0;
//        for (; i <arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//    }
//
//}
//class A{
//    int n;
//    String name;
//
//    public A(int n, String name) {
//        this.n = n;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return name;
//    }
    }
}