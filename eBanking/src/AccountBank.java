public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public AccountBank() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }

    public void displayAccountInformation() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
    }

    public void deposit(double amount) {
        if (amount <=0) {
            System.out.println("Invalid deposit amount");
        }
        this.balance += amount;
    }

    public void withDraw(double amount) {
        if (amount <=0) {
            System.out.println("Invalid withdrawal amount");
        }
        this.balance -= amount;
    }

    public void transfer(String destinationAcountNumber, double amount) {
//        Main.accountBanks = Main.accountBanks;
        if (amount <=0) {
            System.out.println("Invalid transfer amount");
        }
        if (amount > this.balance) {
            System.out.println("not enough money");
        }
        int destinationAccountIndex = -1;
        for (int i = 0; i < Main.accountBanks.size(); i++) {
            AccountBank accountBank = Main.accountBanks.get(i);
            if (accountBank.getAccountNumber().equals(destinationAcountNumber)){
                destinationAccountIndex  = i;
            }
        }
        if (destinationAccountIndex ==-1 ) {
            System.out.println("destination account not available");
            return;
        }
        this.balance -= amount;
        AccountBank destinationAccount = Main.accountBanks.get(destinationAccountIndex);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
