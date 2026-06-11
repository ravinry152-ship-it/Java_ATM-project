package JavaATM;
import java.util.Scanner;

public class Home extends Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====== ATM SYSTEM ======");
        while (true) {
            // Enter card number
            System.out.print("\nEnter Card Number: ");
            int userCard = input.nextInt();

            // Enter password
            System.out.print("Enter Password: ");
            int userPassword = input.nextInt();

            // Check card number
            if (userCard != cardnumber) {
                System.out.println("Incorrect Card Number! Please try again.");
                continue;
            }

            // Check password
            if (userPassword != password) {
                System.out.println("Incorrect Password! Please try again.");
                continue;
            }


            System.out.println("\nLogin Successful!");
            break;
        }


        Menu.main(null);
    }
}