import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String userInput;
        String userInput1;
        String array[] = { "rock", "paper", "scissor" };
        String computer;
        boolean playagain = true;

        System.out.println("*************");
        System.out.println("🪨    📃   ✂️");
        System.out.println("*************");

        while (playagain) {
            System.out.print("Enter your choice (rock, paper & scissor): ");
            userInput = scanner.nextLine();
            System.out.println();
            computer = array[random.nextInt(0, 3)];
            // Inavlid input case
            if (!((userInput.equalsIgnoreCase("rock")) || (userInput.equalsIgnoreCase("scissor"))
                    || (userInput.equalsIgnoreCase("paper")))) {
                System.out.print("INVALID CHOICE\n\n");
                continue;
            }
            // TIE case
            else if (userInput.equalsIgnoreCase(computer)) {
                System.out.println("TIE!");
                // Lost case
            } else if (((userInput.equalsIgnoreCase("rock") && computer.equals("paper"))
                    || (userInput.equalsIgnoreCase("paper")) && (computer.equals("scissor")))
                    || ((userInput.equalsIgnoreCase("scissor")) && (computer.equals("rock")))) {
                System.out.println("LOST!");
                // Won case
            } else if ((((userInput.equalsIgnoreCase("paper") && computer.equals("rock"))
                    || (userInput.equalsIgnoreCase("scissor")) && (computer.equals("paper")))
                    || ((userInput.equalsIgnoreCase("rock")) && (computer.equals("scissor"))))) {
                System.out.println("You Won");
            }
            if (playagain)System.out.println("Computer: " + computer + "\n");
            System.out.println("wanna play again?, y/n");
            userInput1 = scanner.nextLine();
            if (userInput1.equals("n"))playagain = false;
        }
    }
}
