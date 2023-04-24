package DSA.Recursion;

public class RopeCutting {
    static int max(int x,int y,int z){
        if(x>=y && x>=z) return x;
        else if (y>=x && y>=z) return y;
        return z;
    }
    static int noOfPieces(int n,int a,int b,int c){
        if(n<0) return -1;
        if(n==0) return 0;
        int res=max(noOfPieces(n-a,a,b,c),noOfPieces(n-b,a,b,c),noOfPieces(n-c,a,b,c));
        if(res==-1) return -1;
        return res+1;
    }
    public static void main(String[] args) {
//        int res=noOfPieces(23,11,9,12);
        int res=noOfPieces(5,2,5,1);
//        int res=noOfPieces(9,2,2,2);
        System.out.println(res);
    }
}
