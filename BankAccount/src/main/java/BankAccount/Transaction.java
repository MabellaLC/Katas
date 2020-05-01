package BankAccount;

import java.util.Objects;

public class Transaction{
    private final int amount;
    private Date date;

    public Transaction(Date date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return amount == that.amount &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "calendar=" + date +
                ", amount=" + amount +
                '}';
    }

    public StatementLine generateStatementLine(int accumulatedBalance) {
        return new StatementLine(date, amount, amount + accumulatedBalance);
    }

    public int amount() {
        return amount;
    }
}
