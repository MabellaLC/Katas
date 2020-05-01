package BankAccount;

import java.util.Objects;

public class StatementLine {
    private final Date date;
    private final int amount;
    private final int balance;

    public StatementLine(Date date, int amount, int balance) {

        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public boolean isDebit() {
        return amount < 0;
    }

    public String day() {
        return date.day();
    }

    public String month() {
        return date.month();
    }

    public String year() {
        return date.year();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatementLine that = (StatementLine) o;
        return amount == that.amount &&
                balance == that.balance &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount, balance);
    }

    @Override
    public String toString() {
        return "StatementLine{" +
                "date=" + date +
                ", amount=" + amount +
                ", balance=" + balance +
                '}';
    }

}
