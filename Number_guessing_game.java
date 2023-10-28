import java.util.Random;
import java.util.*;

public class Number_guessing_game {
    public static int guessing_game() {
        Random rand = new Random();
        int random_no = rand.nextInt(100) + 1;
        int trynumber = 0;
        try (Scanner s = new Scanner(System.in)) {
            boolean win = false;

            while (win == false) {
                int guess = s.nextInt();
                trynumber++;

                if (guess == random_no) {
                    win = true;
                } else if (guess > random_no) {
                    System.out.println("your guess is too high");
                } else if (guess < random_no) {
                    System.out.println("your guess is too low");
                }
                if (trynumber == 7) {
                    break;
                }

            }
            if (win == true) {

                System.out.println("Congrats ! you guess it right!!");
                System.out.println("you predict the correct number in " + trynumber + " tries");
            } else if (trynumber == 7) {
                System.out.println("you lost the game as your number of tries exhausted");
                System.out.println("The correct number is " + random_no);
            }
        }
        System.out.println();

        return trynumber;
    }

    public static void end_game() {
        Scanner sc = new Scanner(System.in);
        boolean game = true;
        while (game == true) {
            System.out.println("Do you want to play the game again ?? press 1 for yes and 0 for no");
            int number = sc.nextInt();

            if (number == 1) {
                winner();
            } else {
                game = false;
            }
        }
        System.out.println("!! Game Over !!");

        sc.close();
    }

    public static void winner() {
        System.out.println("Both of the  Players are Guess the number in between range 1 to 100");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter player name : ");
            String user = sc.next();

            System.out.println(user + " Your Turn Enter the Guess no ");
            int Player = guessing_game();

        }
    }

    public static void main(String args[]) {
        // Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO THIS GAME!!");
        System.out
                .println("This is a Multiplayer Game both players will get 8 attempts to predict the correct number.");
        winner();
        end_game();
    }
}