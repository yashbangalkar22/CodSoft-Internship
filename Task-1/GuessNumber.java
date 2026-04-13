import java.util.*;

class NumberGame {
    private int number;
    private int attempts;
    private int maxAttempts = 5;

    public NumberGame(int range) {
        number = new Random().nextInt(range) + 1;
        attempts = 0;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Correct! You guessed in " + attempts + " attempts.");
                return;
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }
        }

        System.out.println("Game Over! Number was: " + number);
    }
}

public class GuessNumber {
    public static void main(String[] args) {
        NumberGame game = new NumberGame(100);
        game.play();
    }
}