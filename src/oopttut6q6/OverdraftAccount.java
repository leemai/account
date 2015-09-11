

public class OverdraftAccount extends Account {

    private String accountType;
    private double overdraftLimit;
    private double overdraftInterestRate;

    public OverdraftAccount(int accountNo, String accountHolderName, double accountBalance, String accountType) {
        super(accountNo, accountHolderName, accountBalance);
        this.accountType = accountType;
        if (accountType.equals("Premium")) {
            overdraftLimit = -10000;
            overdraftInterestRate = 0.05;
        } else if (accountType.equals("Gold")) {
            overdraftLimit = -5000;
            overdraftInterestRate = 0.065;
        } else {
            overdraftLimit = -2000;
            overdraftInterestRate = 0.1;
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftInterestRate() {
        return overdraftInterestRate;
    }

    public void setOverdraftInterestRate(double overdraftInterestRate) {
        this.overdraftInterestRate = overdraftInterestRate;
    }

    public void cashOut(double cash) {
        double newBalance = getAccountBalance() - cash;
        if (newBalance > overdraftLimit) {
            setAccountBalance(newBalance);
            System.out.println("Successful withdrawal");
        } else {
            System.out.print("Account Overdrafted!");
        }
    }

    public double calculateInterest() {
        if (getAccountBalance() > 0)
            return super.calculateInterest();
        else {
            double interest = getAccountBalance() * overdraftInterestRate;;
            // super.cashIn(interest);
            return interest ;
            
        }
       
    }
     public String toString(){
        return super.toString() + "\nAccount Type :  "+ accountType + "\nOverdraft Limit : " + overdraftLimit+
        	"\nOverdraft Interest Rate : "+overdraftInterestRate ; 
    }
}
