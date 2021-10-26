public class App {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(), account2 = new BankAccount();
		account1.deposit(1000);
		account2.deposit(100);
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		account1.withdraw(400);
		account2.deposit(400);
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
	}

}

class BankAccount {

	private float balance = 0.0f;

	public float getBalance() {
		return balance;
	}

	public void deposit(float amount) {
		balance += amount;
	}

	public void withdraw(float amount) {
		balance -= amount;
	}
}
