package exam1020;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("김성현","111-333-222");
		BankAccount account2 = new BankAccount("박성현","111-333-444");
		
		System.out.println(BankAccount.getCount());
	
		int currentBalance = account.deposit(10000);
		System.out.println(currentBalance);
		System.out.println(account.getBalance());
		
		int amout = account.withdrawal(5000);
		System.out.println(amout);
		System.out.println(account.getBalance());
		
		amout = account.withdrawal(6000);
		System.out.println(amout);
		System.out.println(account.getBalance());
	}
}
