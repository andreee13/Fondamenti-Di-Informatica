public class BankAccount implements Comparable<BankAccount> {

    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        deposit(initialBalance);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException();
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > balance || amount <= 0)
            throw new IllegalArgumentException();
        balance = balance - amount;
    }

    public void transfer(double amount, BankAccount other) {
        withdraw(amount);
        other.deposit(amount);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof BankAccount) {
            return ((BankAccount) object).balance == balance;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s[balance=%f]%s", getClass().getName(), balance, super.toString());
    }

    @Override
    public int compareTo(BankAccount o) {
        if (balance > o.balance) {
            return 1;
        } else if (balance < o.balance) {
            return -1;
        } else {
            return 0;
        }
    }
}
