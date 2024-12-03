package MiniProject;

public class BankAccount {
	int accountNumber;
	int balance;
	public void deposite(int deposite) {
		balance=balance+deposite;
		System.out.println(balance);
	}
	public void withdraw(int withdraw) {
		balance = balance-withdraw;
	}

}
