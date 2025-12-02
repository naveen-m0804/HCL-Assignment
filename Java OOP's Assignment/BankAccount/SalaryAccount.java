package introductionToJava.oopsAssignment.bankAccount;

public class SalaryAccount extends BankAccount{
	private int salary;
	
	public SalaryAccount(String accName, int balance, int salary)
	{
		super(accName, balance);
		this.salary = salary;
	}
	
	public void creditSalary()
	{
		System.out.println("Crediting monthly salary...");
        deposit(salary);
	}
}
