package BankAccount;

import java.util.Objects;

public class Transaction{
    private final Date calendar;
    private final int amount;

    public Transaction(Date calendar, int amount) {
        this.calendar = calendar;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return amount == that.amount &&
                Objects.equals(calendar, that.calendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calendar, amount);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "calendar=" + calendar +
                ", amount=" + amount +
                '}';
    }
}
