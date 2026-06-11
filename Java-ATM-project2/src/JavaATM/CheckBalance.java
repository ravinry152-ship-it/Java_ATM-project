package JavaATM;
import java.util.Scanner;
public class CheckBalance extends Data {
    public void execute() {
        Scanner input = new Scanner(System.in);
          System.out.println("Enter Your Balance :");
          String b=input.next();
          if(b.equals("Dula")){
              System.out.println("Current Balance: $" + balance);
          }else if(b.equals("Khmer")){
              System.out.println("Current Balance: ៛" + blancekhmer);
          }


    }
}
