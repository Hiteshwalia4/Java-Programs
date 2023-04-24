package Placement_Ques;

import java.util.Arrays;
import java.util.Scanner;

//Ceaser Cipher technique
public class Ques1 {
    public static void main(String[] args) {
        String code="IZ2PQRIS";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String text= sc.nextLine();
        text=text.toUpperCase();
        for (int i = 0; i <text.length() ; i++) {
            if(text.charAt(i)=='X') text=text.replace(text.charAt(i),'A');
            else if(text.charAt(i)=='Y') text=text.replace(text.charAt(i),'B');
            else if(text.charAt(i)=='Z') text=text.replace(text.charAt(i),'C');
            else{
            text = text.replace(text.charAt(i), (char) (text.charAt(i) + 3));
            }
        }

        System.out.println(text);
    }
}
