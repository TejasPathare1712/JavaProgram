package MiniProject;

public class SavingsAccount extends BankAccount {
	float interestRate=0.10f;
	public void calculateInterest(int balance) {
		float interest = balance*interestRate;
		System.out.println(interest);
	}

}
