import java.util.Random;
import java.util.Scanner;

class RandomNumberGuesser {
    private int rounds;
    private int user_inp;
    private int comp_inp;

    public RandomNumberGuesser() {
        Random rand = new Random();
        comp_inp = rand.nextInt(100) + 1; // Generates 1 to 100
        rounds = 0;
    }

    public void takeuserinp(int x) {
        user_inp = x;
    }

    public boolean iscorrectnumber() {
        rounds++;
        if (user_inp > comp_inp) {
            System.out.println("Guess a lower number.");
            return false;
        } else if (user_inp < comp_inp) {
            System.out.println("Guess a higher number.");
            return false;
        } else {
            System.out.println("You guessed the correct number: " + comp_inp);
            System.out.println("You guessed it in " + rounds + " rounds!");
            return true;
        }
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomNumberGuesser game = new RandomNumberGuesser();
        boolean hasWon = false;

        while (!hasWon) {
            System.out.print("Enter your guess (1-100): ");
            int n = sc.nextInt();
            game.takeuserinp(n);
            hasWon = game.iscorrectnumber();
        }

        sc.close();
    }
}