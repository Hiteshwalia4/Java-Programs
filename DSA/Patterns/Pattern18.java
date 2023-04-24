package DSA.Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( (char)(j - i + 69) + " ");
            }
            System.out.println();
        }
    }
}
