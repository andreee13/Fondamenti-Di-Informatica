public class TimeDepositAccount extends SavingsAccount {

    private int months;

    public TimeDepositAccount(double initialBalance, double rate, int months) {
        super(initialBalance, rate);
        this.months = months;
    }

    public TimeDepositAccount(double rate, int months) {
        super(rate);
        this.months = months;
    }

    public int getMonthsLeft() {
        return months;
    }

    @Override
    public void withdraw(double amount) {
        if (months > 0) {
            super.withdraw(amount + 20);
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void addInterest() {
        super.addInterest();
        months--;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof TimeDepositAccount) {
            return ((TimeDepositAccount) object).getMonthsLeft() == months
                    && super.equals(object);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s[months=%d]%s", getClass().getName(), months, super.toString());
    }

}
