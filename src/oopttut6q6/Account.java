
public class Account {

    private int accountNo;
    private String accountHolderName;
    private double accountBalance;
    private static double annualInterestRate;

    public Account(int accountNo, String accountHolderName, double accountBalance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public void cashIn(double cash) {
        accountBalance += cash;
    }

    public void cashOut(double cash) {
        accountBalance -= cash;
    }
    public double calculateInterest(){
        double interest = accountBalance * annualInterestRate;
       // accountBalance += interest;
        return interest;
    }
    public String toString(){
        return "Account Number : " + accountNo + "\nAccount Holder Name :  "+accountHolderName 
                  + "\nAccount Balance : "+ accountBalance; 
    }
}
