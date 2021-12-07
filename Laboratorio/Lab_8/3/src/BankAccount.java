public class BankAccount {

    private float balance = 0.0f;

    public float getBalance() {
        return balance;
    }

    public boolean deposit(float amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(float amount) {
        if (amount <= 0 || balance - amount < 0) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean addInterest(float percentage) {
        if (percentage <= 0) {
            return false;
        }
        balance += (percentage * balance) / 100;
        return true;
    }
}
