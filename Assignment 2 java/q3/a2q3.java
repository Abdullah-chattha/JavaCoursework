
public class a2q3 {
	public static void main(String[] args) {
		//creates object
		BankAccount account = new BankAccount();
		
		account.deposit (5000);
		account.withdraw(400);
		System.out.println("The balance is: "+ account.getBalance());
		//runs for 7 times
		for (int i = 0;i < 7; i++) {
			account.deposit(200);
		}
		System.out.println("The balance after transactions is: "+ account.getBalance());
		account.deductMonthlyCharge();
		System.out.println("The balance with transaction and deducted charge is: "+ account.getBalance());

	}
}
