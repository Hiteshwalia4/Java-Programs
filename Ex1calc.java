import java.util.Scanner;
public class Ex1calc {
    public static void main(String[] args) {
    int total_marks = 100;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter marks of 1st subject: ");
    int first = sc.nextInt();
    System.out.println("Enter marks of 2nd subject: ");
    int second = sc.nextInt();
    System.out.println("Enter marks of 3rd subject: ");
    int third = sc.nextInt();
    System.out.println("Enter marks of 4th subject: ");
    int fourth = sc.nextInt();
    System.out.println("Enter marks of 5th subject: ");
    int fifth = sc.nextInt();


    float sum = first + second + third + fourth + fifth;
    float percent =  sum * 100 / ( 5 * total_marks);
    System.out.println("Percentage of Student is: " + percent);

    }
}
