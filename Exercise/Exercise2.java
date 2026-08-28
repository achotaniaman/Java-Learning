import java.util.Random;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("======================================");
        System.out.println("      ROCK PAPER SCISSORS GAME");
        System.out.println("======================================");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        boolean playAgain = true;

        while (playAgain) {

            int playerWins = 0;
            int computerWins = 0;
            int ties = 0;

            System.out.print("\nHow many rounds do you want to play? ");
            int rounds = sc.nextInt();
            sc.nextLine();

            for (int round = 1; round <= rounds; round++) {

                int computer = rand.nextInt(3);

                System.out.println("\n----------------------------");
                System.out.println("Round " + round);
                System.out.println("----------------------------");

                System.out.print("Enter R for Rock, P for Paper, S for Scissors: ");
                String userChoice = sc.nextLine().toUpperCase();

                if (!(userChoice.equals("R") || userChoice.equals("P") || userChoice.equals("S"))) {
                    System.out.println("Invalid input! Round will be replayed.");
                    round--;
                    continue;
                }

                String computerChoice = "";

                if (computer == 0)
                    computerChoice = "Rock";
                else if (computer == 1)
                    computerChoice = "Paper";
                else
                    computerChoice = "Scissors";

                String playerChoice = "";

                if (userChoice.equals("R"))
                    playerChoice = "Rock";
                else if (userChoice.equals("P"))
                    playerChoice = "Paper";
                else
                    playerChoice = "Scissors";

                System.out.println(name + " chose : " + playerChoice);
                System.out.println("Computer chose : " + computerChoice);

                if ((computer == 0 && userChoice.equals("R")) ||
                    (computer == 1 && userChoice.equals("P")) ||
                    (computer == 2 && userChoice.equals("S"))) {

                    System.out.println("🤝 It's a Tie!");
                    ties++;

                } else if ((computer == 0 && userChoice.equals("P")) ||
                           (computer == 1 && userChoice.equals("S")) ||
                           (computer == 2 && userChoice.equals("R"))) {

                    System.out.println("🎉 " + name + " Wins this Round!");
                    playerWins++;

                } else {

                    System.out.println("💻 Computer Wins this Round!");
                    computerWins++;
                }

                System.out.println("\nCurrent Score");
                System.out.println(name + " : " + playerWins);
                System.out.println("Computer : " + computerWins);
                System.out.println("Ties : " + ties);
            }

            System.out.println("\n======================================");
            System.out.println("FINAL RESULT");
            System.out.println("======================================");

            System.out.println(name + " Wins : " + playerWins);
            System.out.println("Computer Wins : " + computerWins);
            System.out.println("Ties : " + ties);

            if (playerWins > computerWins) {
                System.out.println("\n Congratulations " + name + "! You Won the Match!");
            } else if (computerWins > playerWins) {
                System.out.println("\n Computer Won the Match!");
            } else {
                System.out.println("\n Match Tied!");
            }

            System.out.print("\nPlay Again? (Y/N): ");
            String again = sc.nextLine().toUpperCase();

            playAgain = again.equals("Y");
        }

        System.out.println("\nThanks for playing!");

        sc.close();
    }
}