package exam1105;

public class BankAccount {
	private static int count=0; 
	
	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount() {}
	public BankAccount(String name, String accountNumber) {
		this.name=name;
		this.accountNumber=accountNumber;
		count += 1;
	}

	public BankAccount(String name,String accountNumber,int balance) {
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=balance;
		count += 1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int withdrawal(int amount) {
		int finalAmout = amout;
		if (amount > balance) {
			finalAmout = balance;
		}
		balance
	}

}
