package JavaATM;
import java.util.Scanner;

public class Menu extends Home {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;

        // បង្កើត Object នៃ Class នីមួយៗទុកសម្រាប់ហៅប្រើ
        CheckBalance checkBalanceObj = new CheckBalance();
        Withdraw withdrawObj = new Withdraw();
        Deposit depositObj = new Deposit();
        Transfer transferObj = new Transfer();

        do {
            // Menu
            System.out.println("\n===== MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            System.out.print("Choose Option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    checkBalanceObj.execute();
                    break;

                case 2:
                    withdrawObj.execute(input);
                    break;

                case 3:
                    depositObj.execute(input);
                    break;

                case 4:
                    transferObj.execute(input);
                    break;

                case 5:
                    System.out.println("Thank You for Using ATM!");
                    break;

                default:
                    System.out.println("Invalid Option!");
            }

        } while (choice != 5);

        input.close();
    }
}