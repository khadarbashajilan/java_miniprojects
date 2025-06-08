import java.util.*;

public class madLibs_game {
// to get good with accepting user inputs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String noun1;
        String adjective1;
        String adjective2;
        String adjective3;
        String verb1;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        
        System.out.print("Enter an verb end with -ing (action): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a "+adjective1+ "zoo");
        System.out.println("In an exhibit, I saw a "+noun1+".");
        System.out.println(noun1+" was "+adjective2 +" and "+verb1+"!");
        System.out.println("I was "+adjective3+"!");

        scanner.close();
    }
}