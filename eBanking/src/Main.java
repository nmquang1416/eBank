import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<AccountBank> accountBanks = new ArrayList<>();
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("welcome to the ebank");
         System.out.println("please enter your account number:");
         String acountnumber = scanner.nextLine();
         System.out.println("please enter your account holder name:");
         String accountholdername = scanner.nextLine();
         System.out.println("please enter your account balance:");
         double balance = scanner.nextDouble();
         scanner.nextLine();
         AccountBank accountBank = new AccountBank();
         accountBank.setBalance(balance);
         accountBank.setAccountHolderName(accountholdername);
         accountBank.setAccountNumber(acountnumber);

         System.out.println("========================================");
         System.out.println("Your account balance is: " + accountBank.getBalance());
         System.out.println("test deposit method");
         double deposit = 2000;
         System.out.println("Deposit ammount is:" + deposit);
         accountBank.deposit(deposit);
         System.out.println("your account balance after deposit is: " + accountBank.getBalance());

         System.out.println("========================================");
         System.out.println("test deposit method");
         double withDraw = 4000;
         System.out.println("With draw ammount is:" + withDraw);
         accountBank.withDraw(withDraw);
         System.out.println("your account balance after deposit is: " + accountBank.getBalance());

         System.out.println("========================================");
         AccountBank destinationAccountBank = new AccountBank();
         destinationAccountBank.setAccountNumber("013");
         destinationAccountBank.setAccountHolderName("Hong luyen");
         destinationAccountBank.setBalance(100000);
         accountBanks.add(destinationAccountBank);
         accountBanks.add(accountBank);
         System.out.println("Destination account");
         accountBank.transfer("013",5000);
         System.out.println("After transfer method");
         System.out.println("My account");
         accountBank.displayAccountInformation();
         System.out.println("Destination account");
         destinationAccountBank.displayAccountInformation();

    }
}