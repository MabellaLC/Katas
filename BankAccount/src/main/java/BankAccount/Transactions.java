package BankAccount;

public interface Transactions {
    void record(int amount);
    Statement statement();
}
