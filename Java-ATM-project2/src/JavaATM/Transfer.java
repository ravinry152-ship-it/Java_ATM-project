package JavaATM;
import java.util.Scanner;

public class Transfer extends Data {
    public void execute(Scanner input) {
        int rate = 4000;

        System.out.println("\n--- Transfer Money ---");
        System.out.println("1. USD to KHR");
        System.out.println("2. KHR to USD ");
        System.out.print("Choose Transfer Type (1 or 2): ");
        int type = input.nextInt();

        // =================  USD to KHR =================
        if (type == 1) {
            System.out.print("Enter Transfer Amount (USD): $");
            int transferUSD = input.nextInt();

            // ពិនិត្យមើលថាលុយដុល្លារគ្រប់គ្រាន់សម្រាប់ផ្ទេរដែរឬទេ
            if (transferUSD <= balance) {
                balance -= transferUSD;
                blancekhmer += (transferUSD * rate);

                System.out.println("Transfer Successful!");
                System.out.println("Remaining USD Balance: $" + balance);
                System.out.println("New KHR Balance: ៛" + blancekhmer);
            } else {
                System.out.println("Insufficient USD Balance!");
            }
        }
        // =================   KHR to USD =================
        else if (type == 2) {
            System.out.print("Enter Transfer Amount (KHR): ៛");
            int transferKHR = input.nextInt();

            // ពិនិត្យមើលថាលុយរៀលគ្រប់គ្រាន់សម្រាប់ផ្ទេរដែរឬទេ
            if (transferKHR <= blancekhmer) {
                blancekhmer -= transferKHR;
                balance += (transferKHR / rate);

                System.out.println("Transfer Successful!");
                System.out.println("Remaining KHR Balance: ៛" + blancekhmer);
                System.out.println("New USD Balance: $" + balance);
            } else {
                System.out.println("Insufficient KHR Balance!");
            }
        }

        else {
            System.out.println("Invalid Option!");
        }
    }
}