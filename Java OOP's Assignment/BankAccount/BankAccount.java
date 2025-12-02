package introductionToJava.oopsAssignment.bankAccount;

public class BankAccount {
	protected String accName;
	protected int balance;

	public BankAccount(String accName, int balance) {
		this.accName = accName;
		this.balance = balance;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(accName + " Deposited : " + amount);
		}
		else {
			System.out.println("Invalid deposit amount...!");
		}
	}
	
	public void withdraw(int amount)
	{
		if(amount > 0 && balance >= amount)
		{
			balance -= amount;
		}
		else {
			System.out.println("Balance Insufficient");
		}
	}
	
	public void displayBalance()
	{
		System.out.println(accName + " Current Balance : " + balance);
	}
}
