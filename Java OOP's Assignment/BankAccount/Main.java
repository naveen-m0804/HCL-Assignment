package introductionToJava.oopsAssignment.bankAccount;

public class Main {
	public static void main(String[] args) {
		System.out.println("--- Savings Account ---");
		
        SavingsAccount savings = new SavingsAccount("Naveen", 1000, 5); 
        
        savings.deposit(500);       
        savings.addInterest();       
        savings.withdraw(200);      
        savings.displayBalance();  

        System.out.println();  

        System.out.println("--- Salary Account ---");
        SalaryAccount salaryAcc = new SalaryAccount("Naveen", 500, 5000);
        
        salaryAcc.creditSalary();   
        salaryAcc.withdraw(1000);   
        salaryAcc.displayBalance(); 
	}
}
