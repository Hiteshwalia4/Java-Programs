import java.util.Scanner;
import java.util.Random;

public class Ex2sps {
    public static void main(String[] args) {
        System.out.println("************* ROCK PAPER SCISSORS *************");
        System.out.println("Instructions: ");
        System.out.println("1. A simple game which will consist of 5 rounds and winner of maximum " +
                "rounds will be the final WINNER!!!");
        System.out.println("2. Winning Conditions: Rock wins over Scissors, Scissors win over Paper " +
                "and Paper wins over Rock");
        System.out.println("3. User will have to enter input as \"0\" (for Rock), " +
                "\"1\" (for Scissors), \"2\" (for Paper)");
        System.out.println("So Lets Beginn, Goodluck :-)\n\n");

        int i=0;
        int uchoice_count = 0;
        int cchoice_count = 0;
        Random rand= new Random();
        Scanner sc = new Scanner(System.in);

        while(i!=5) {
            int comp_choice = rand.nextInt(3);
            System.out.print("Enter Your Choice: ");
            int user_choice = sc.nextInt();

            switch (user_choice) {
                case 0:
                    if (comp_choice == 1) {
                        System.out.println("You Won..");
                        uchoice_count++;

                    } else if (comp_choice == 2) {
                        System.out.println("Computer Won..");
                        cchoice_count++;

                    } else {
                        System.out.println("DRAW..");
                    }
                    System.out.println("Computer's choice was:  " + comp_choice);
                    System.out.println("Your Choice was:  " + user_choice);
                    break;
                case 1:
                    if (comp_choice == 2) {
                        System.out.println("You Won..");
                        uchoice_count++;
//                        break;
                    } else if (comp_choice == 0) {
                        System.out.println("Computer Won..");
                        cchoice_count++;
//                        break;
                    } else {
                        System.out.println("DRAW..");
//                        break;
                    }
                    System.out.println("Computer's choice was:  " + comp_choice);
                    System.out.println("Your Choice was:  " + user_choice);

                    break;
                case 2:
                    if (comp_choice == 0) {
                        System.out.println("You Won..");
                        uchoice_count++;
//                        break;
                    } else if (comp_choice == 2) {
                        System.out.println("Computer Won..");
                        cchoice_count++;
//                        break;
                    } else {
                        System.out.println("DRAW..");
                    }
                    System.out.println("Computer's choice was:  " + comp_choice);
                    System.out.println("Your Choice was:  " + user_choice);

                    break;

            }
            i++;
        }
        System.out.println("User Wins count: " + uchoice_count);
        System.out.println("Computer Wins count: " + cchoice_count);
        if (cchoice_count <  uchoice_count){
            System.out.println("Congratulations User, You WON!!!");
        }
        else if (cchoice_count == uchoice_count){
            System.out.println("Game Drawn...");
        }
        else {
            System.out.println("Badluckk!! You LOST");
        }

        System.out.println("********************* THANK YOU FOR PLAYING THE GAME *********************");

    }
}
