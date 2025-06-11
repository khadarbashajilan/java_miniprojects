import java.util.Random;
import java.util.Scanner;

public class diceRollgame {
    static int min =1;
    static int max =7;
    public static void main(String[] args) {
        int num;
        int generator;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the number of dice to roll: ");
        num = scanner.nextInt();
        System.out.print("Rolling Dice ...\n");
        for(int i=1; i<num+1; i++){
            generator = random.nextInt(min,max);
            RollDice(generator);
        }
        System.out.print("YOU ROLLED "+num+" TIMES");   
        scanner.close();
    }
    static void RollDice(int generator){
         switch(generator){
                case 1 -> System.out.println("ONE");
                case 2 -> System.out.println("TWO");
                case 3 -> System.out.println("THREE");
                case 4 -> System.out.println("FOUR");
                case 5 -> System.out.println("FIVE");
                case 6 -> System.out.println("SIX");
            }
    }
}
