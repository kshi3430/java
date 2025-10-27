package exam1020;

public class BankAccount {
	private static int count = 0;
	
	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount() {}
	public BankAccount(String name, String acciuntNumber) {
		this.name = name;
		this.accountNumber = acciuntNumber;
		this.balance = 0;
		count += 1;
	}
	
	public BankAccount(String name, String acciuntNumber, int balance) {
		this.name = name;
		this.accountNumber = acciuntNumber;
		this.balance = balance;
		count +=1;		
	}
	
	public static int getCount() {
		return count;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcciuntNumber() {
		return accountNumber;
	}
	public void setAcciuntNumber(String acciuntNumber) {
		this.accountNumber = acciuntNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int withdrawal(int amout) {
		int finalAmout = amout;
		if (amout > balance) {
			finalAmout = balance;
		}
		balance -= finalAmout;
		return finalAmout;
	}
	public int deposit(int amout) {
		balance += amout;
		return balance;
	}
}
