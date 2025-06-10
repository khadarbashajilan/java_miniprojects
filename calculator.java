import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char operator;
        double operand1;
        double operand2;
        double result=0;
        boolean check=true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first operand: ");
        operand1 = scanner.nextDouble();

        System.out.print("Enter the first operand: ");
        operand2 = scanner.nextDouble();

        System.out.print("Enter the operator (+,-,*,/,^): ");
        operator = scanner.next().charAt(0);

        switch(operator){
            case '+'-> result = operand1 + operand2;
            case '-'-> result = operand1 - operand2;
            case '*'-> result = operand1 * operand2;
            case '/'-> {if(operand2 ==0 ) System.out.print(operand1+" can't be divisible with ");
                        else result = operand1 / operand2;}
            case '^'-> result = Math.pow(operand1,operand2);
            default -> {System.out.print("Wrong operator entered"); check = false;}
        }

        if(check)System.out.print(result);

        scanner.close();
    }
}
