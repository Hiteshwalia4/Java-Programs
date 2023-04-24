package BCIIT.ClassPrac;
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for 1st Octet: ");
        a = sc.nextInt();

        System.out.println("Enter the value for 2nd Octet: ");
        b = sc.nextInt();

        System.out.println("Enter the value for 3rd Octet: ");
        c = sc.nextInt();

        System.out.println("Enter the value for 4th Octet: ");
        d = sc.nextInt();

        if(a>=0 && a<=255 && b>=0 && b<=255 && c>=0 && c<=255 && d>=0 && d<=255)
        {
            System.out.println("Address Valid :-)");

            if(a>=1 && a<=126)
                System.out.println("Class A Address ");

            else if(a==127){
                System.out.println("Loopback Address");
            }
            else if (a>128 && a<=191){
                System.out.println("Class B Address ");
            }
            else if(a>=192 && a<=233){
                System.out.println("Class C Address ");
            }
            else if (a>=234 && a<=239){
                System.out.println("Class D Address ");
            }
            else if(a>=240 && a<=254){
                System.out.println("Class E Address");
            }
        }
        else{
            System.out.println("Address is not Valid :-(");
        }
    }
}
