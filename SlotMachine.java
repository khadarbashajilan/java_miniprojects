import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        int balance = 1000;
        int bet;
        boolean Playagain=true;
        Scanner scanner = new Scanner(System.in);
        String[] symbols = {"@","#","%","!","$"};
        System.out.print("Enter bet amount: ");
        bet = scanner.nextInt();

        System.out.print("Spinning ...\n");
        while(Playagain){

            if(bet<10){
                System.out.print("Bet amount should be greater than or equal to 10");
            }else if(bet>balance){
                System.out.print("Bet amount is greater than balance");
            }else{
                // String[] generated= spin(symbols);
                System.out.print("Wanna play again y/n :");
                String c = scanner.next().toLowerCase();
                if(c=="n"){
                    Playagain=false;
                }
            }
        }

    }
    static String[] spin(String[] str){
        Random random = new Random();
        String[] result = new String[3];
        for(int i=0;i<3; i++){
            result[i]=str[random.nextInt(0,5)];
        }
        return result;
    }
}
