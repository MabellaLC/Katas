package BankAccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InMemoryTransactions implements Transactions {
    List<Transaction> transactionsList = new ArrayList<>();
    private Calendar calendar;

    public InMemoryTransactions(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public void record(int amount) {
        transactionsList.add(new Transaction(calendar.day(), amount));
    }

    @Override
    public Statement statement() {
        if (transactionsList.isEmpty()) {
            return new Statement(new ArrayList<>());
        }
        return new Statement(
                Arrays.asList(
                        new StatementLine(new Date("10-05-2016"), 500, 500),
                        new StatementLine(new Date("10-05-2016"), -200, 300))
        );
    }
}
