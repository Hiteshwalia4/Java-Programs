import java.util.Scanner;
import java.util.Random;

class Game{
    int rnum;
    int unum;
    int noOfGuesses=0;
    Game(){
        Random rand = new Random();
        rnum= rand.nextInt(101);
    }
    void takeUserInput(){
        System.out.print("Enter any Number(b/w 0 to 100): ");
        Scanner sc = new Scanner(System.in);
        unum = sc.nextInt();
    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (unum==rnum){
            System.out.println("Congratulations, Your guess is correct and You Guessed it in " + noOfGuesses + " attempts ");
            return true;
        }
        else if (unum>rnum) {
            System.out.println("Higherr!!  Enter smaller number...");
        }
        else if(unum<rnum){
            System.out.println("Lowerr!!  Enter Higher number...");
        }
        return false;
    }
}

public class Ex3Guess {
    public static void main(String[] args) {
        Game Hue = new Game();
        boolean res=false;
        while(!res) {
            Hue.takeUserInput();
            res= Hue.isCorrectNumber();
            System.out.println(res);
        }
    }
}
