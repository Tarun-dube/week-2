package hierarchical_inheritence.bankAccount;

public class SavingAccount extends BankAccount{
    double interestRate;

    // Constructor for SavingsAccount
    SavingAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type
    public void displayAccountType(){
        System.out.println("Saving Account");
        System.out.println("Interest Rate: "+ interestRate + "%");
    }
}
