public class CheckingAccount extends BankAccount {

    private int transactionCount;
    public static final int FREE_TRANSACTIONS = 3;
    public static final double TRANSACTION_FEE = 2.0;

    public CheckingAccount() {
        super();
        transactionCount = 0;
    }

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        transactionCount = 0;
    }

    public CheckingAccount(double initialBalance, int initialTransCount) {
        super(initialBalance);
        transactionCount = initialTransCount;
    }

    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
    }

    public void deductFees() {
        if (transactionCount > FREE_TRANSACTIONS) {
            double fees = TRANSACTION_FEE *
                    (transactionCount - FREE_TRANSACTIONS);
            super.withdraw(fees);
        }
        transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof CheckingAccount) {
            return ((CheckingAccount) object).transactionCount == transactionCount && super.equals(object);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s[transactionCount=%d]%s", getClass().getName(), transactionCount, super.toString());
    }

}
