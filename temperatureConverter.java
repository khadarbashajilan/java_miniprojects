import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperature=0;
        char unit;
        double result=0;

        System.out.print("Enter the Temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Farenheit (C or F): ");
        // unit=scanner.next().charAt(0);
        unit= Character.toLowerCase(scanner.next().charAt(0));
        // System.out.print(unit);

        if(unit=='c'){
            result = (temperature-32) * (5.0/9);
            System.out.print("The converted Temperature: "+result+"°C");
        } else if(unit=='f'){
            result = (temperature*(9.0/5)) +32; 
            System.out.print("The converted Temperature: "+result+"°F");
        }else{
            System.out.print("Wrong unit, Try again");
        }

        scanner.close();
    }
}
