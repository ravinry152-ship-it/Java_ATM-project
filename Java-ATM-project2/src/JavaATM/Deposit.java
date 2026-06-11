package JavaATM;
import java.util.Scanner;

public class Deposit extends Data {
    public void execute(Scanner input) {
        System.out.print("Enter Currency Type to Deposit (Dula / Khmer): ");
        String currency = input.next();
        if(currency.equalsIgnoreCase("Dula")){
            System.out.println("Enter Deposit Amount (USD): $");
            int deposit = input.nextInt();
            balance += deposit;
            System.out.println("Deposit Successful!");
            System.out.println("New Balance: $" + balance);

        } else if (currency.equalsIgnoreCase("Khmer")) {
            System.out.println("Enter Deposit Amount (Khmer): ៛");
            int deposit = input.nextInt();
            System.out.println("Deposit Successful!");
            blancekhmer+=deposit;
            System.out.println("New Balance: $" + blancekhmer);

        }else{
            System.out.println("Invalid Currency Type! Please try again.");
        }
    }
}