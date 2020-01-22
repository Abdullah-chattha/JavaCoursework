
public class BankAccount
{
	
    private double balance;
    private double transactionFee = 10;
    private int count = 0;
    
      
    public BankAccount() {
        balance = 0;
    }
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // mutators
    public void deposit(double amount) {
        balance = balance + amount;
        count = count + 1;
    }
    
    public void withdraw(double amount) {
        balance = balance - amount;
        count = count + 1;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deductMonthlyCharge(){
        if (count > 5) 
        balance = balance - transactionFee * (count - 5);
        count = 0;
    }
}