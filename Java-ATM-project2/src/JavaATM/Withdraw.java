package JavaATM;
import java.util.Scanner;

public class Withdraw extends Data {
    public void execute(Scanner input) {
        System.out.print("Enter Currency Type to Withdraw (Dula / Khmer): ");
        String currency = input.next();

        if (currency.equalsIgnoreCase("Dula")) {
            System.out.print("Enter Withdraw Amount (USD): $");
            int withdraw = input.nextInt();

            if (withdraw <= balance) {
                balance -= withdraw;
                System.out.println("Withdraw Successful!");
                System.out.println("New Balance: $" + balance);
            } else {
                System.out.println("Insufficient USD Balance!");
            }
        }
        //  ករណីគាត់ចង់ដកលុយរៀល
        else if (currency.equalsIgnoreCase("Khmer")) {
            System.out.print("Enter Withdraw Amount (KHR): ៛");
            int withdrawKhmer = input.nextInt();

            if (withdrawKhmer <= blancekhmer) {
                blancekhmer -= withdrawKhmer;
                System.out.println("Withdraw Successful!");
                System.out.println("New Balance: ៛" + blancekhmer);
            } else {
                System.out.println("Insufficient KHR Balance!");
            }
        }

        else {
            System.out.println("Invalid Currency Type! Please try again.");
        }
    }
}