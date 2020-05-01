package BankAccount;

import java.util.Objects;

public class Date{
    private String date;

    public Date(String date) {
        this.date = date;
    }

    public String day() {
        return date.substring(0, 2);
    }

    public String month() {
        return date.substring(3, 5);
    }

    public String year() {
        return date.substring(6, 10);
    }

    @Override
    public String toString() {
        return "Date{" +
                "date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date1 = (Date) o;
        return Objects.equals(date, date1.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}
