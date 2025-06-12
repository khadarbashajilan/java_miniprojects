import java.util.Scanner;

public class bankingProgram {
    static Scanner scanner = new Scanner(System.in);
    static boolean exit = false;
    static double balance=0;
    public static void main(String[] args) {
            while(!exit){
                menu();
                int input = scanner.nextInt();
                if((input<5 && input>0)){
                handleChoice(input);
                }else{
                    System.out.print("Invalid choice\n");
                    scanner.next();
                }
            }
    }
    private static void menu(){
        System.out.print("\n1. SHOW BALANCE\n" +
                        "2. DEPOSIT\r\n" + 
                        "3. WITHDRAW\r\n" + 
                        "4. EXIT\n\n");
        System.out.print("Enter ur choice: ");
        
    }
    private static void handleChoice(int n){
        switch(n){
            case 1 -> System.out.print(balance+"\n");
            case 2 -> deposit();
            case 3 -> withdraw();
            case 4 -> exit= true;
        }
    }
    private static void deposit(){
        System.out.print("Enter amount: ");
        double x = scanner.nextDouble();
        if(x>0){
            balance+=x;
        }else{
            System.out.print("Enter +ve number");
        }
    }

    private static void withdraw(){
        System.out.print("Enter amount: ");
        double x = scanner.nextDouble();
        if(x>0){
            if(x<balance && balance>0){
                balance-=x;
            }else{
                System.out.print("Insufficient balance");
            }
        }else{
            System.out.print("Enter +ve number");
        }
    }


}
