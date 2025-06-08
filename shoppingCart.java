import java.util.Scanner;
public class shoppingCart {
    // to get good with accepting user inputs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        int price = scanner.nextInt();

        System.out.print("How many would you want to buy?: ");
        int total_items = scanner.nextInt();

        if(total_items>1){
            item+="s";
        }

        System.out.println("You have bought "+total_items+" "+item);
        System.out.println("Yout total is "+price*total_items);
        scanner.close();
    }
}
