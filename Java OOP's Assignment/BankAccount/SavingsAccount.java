package introductionToJava.oopsAssignment.bankAccount;

public class SavingsAccount extends BankAccount {
	private int interestAmtRate;
	
	public SavingsAccount(String accName, int balance, int interestAmtRate) {
		super(accName, balance);
		this.interestAmtRate= interestAmtRate;
	}
	
	public void addInterest()
	{
		int interestAmt = (int) (balance * (interestAmtRate/100.0));
		deposit(interestAmt); 
		System.out.println("Interest of " + interestAmt + " is added");
	}
	
}
