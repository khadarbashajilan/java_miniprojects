import java.util.Scanner;

public class weightCalculator{
    // weight calculator lbs->kgs & kg->lbs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // double input;
        // double calcweight=0.0;

        // System.out.print("1. Convert lbs to kg\n2. Convert kg to lbs\n");
        // int num = scanner.nextInt();

        // if(num==2){
        //     System.out.print("Enter the weigth in kg: ");
        //     calcweight = scanner.nextDouble()*2.20462;
        // }else if(num==1){
        //     System.out.print("Enter the weigth in kg: ");
        //     calcweight = scanner.nextDouble()*0.453592;
        // }else{
        //     System.out.print("Wrong choice, Try again");
        // }

        // System.out.printf("The calculated weight is %.2f",calcweight);

        String input="";
        String unit="";
        double value=0;
        double calcWeight=0;

        System.out.println("kg <-> lbs");
        System.out.print("Enter the weight : ");
        input = scanner.nextLine();
        input.trim();
        input.toLowerCase();

        if(input.contains("l")){
            value = Double.parseDouble(input.substring(input.indexOf(input.charAt(0)),input.indexOf("l")));  
            calcWeight=value*0.453592;
            System.out.printf("The weigth is %.2f kg",calcWeight);
        }
        else if(input.contains("k")){
            value = Double.parseDouble(input.substring(input.indexOf(input.charAt(0)),input.indexOf("k")));
            calcWeight=value*2.20462;  
            System.out.printf("The weigth is %.2f lbs",calcWeight);
        }else{
            System.out.print("Enter with si unit");
        }

        scanner.close();
    }
}