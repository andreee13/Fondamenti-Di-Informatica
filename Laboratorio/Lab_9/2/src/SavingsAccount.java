public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double rate) {
        super();
        interestRate = rate;
    }

    public SavingsAccount(double initialBalance, double rate) {
        super(initialBalance);
        interestRate = rate;
    }

    public void addInterest() {
        super.deposit(getBalance() * interestRate / 100);
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof SavingsAccount) {
            return ((SavingsAccount) object).interestRate == interestRate && super.equals(object);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s%s", getClass().getName(), super.toString());
    }

}
