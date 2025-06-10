import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 11;
        int guess = random.nextInt(min, max);
        int num;
        int attempts = 0;
        // System.out.print(guess);
        System.out.printf("Guess the number in between %d - %d: ", min, max - 1);

        do {
            num = scanner.nextInt();
            attempts++;
            if (num == 0 || num == guess)
                break;
            else if (num > guess) {
                System.out.println("Too HIGH!");
            } else {
                System.out.println("Too LOW!");
            }

            if (attempts > 3) {
                System.out.println("(To Give Up, Enter 0)");
            }
        } while (true);

        if (num == guess) {
            System.out.print("CORRECT! Total attempts -> " + attempts);
        } else {
            System.out.print("GAME OVER!, The number was " + guess);
        }
        scanner.close();
    }
}
