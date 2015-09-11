

public class FixedDepositAccount extends Account{
    private int savingYears;

    public FixedDepositAccount(int accountNo, String accountHolderName, double accountBalance,int savingYears) {
        super ( accountNo,  accountHolderName,  accountBalance);
        this.savingYears = savingYears;
    }

    public int getSavingYears() {
        return savingYears;
    }

    public void setSavingYears(int savingYears) {
        this.savingYears = savingYears;
    }
    public double calculateInterest(){
        double interest =  getAccountBalance() * getAnnualInterestRate()* savingYears;
       // super.cashIn(interest);
        return interest;
    }
    public String toString(){
        return super.toString() + "\nSaving Years : "+ savingYears ; 
    }
}
