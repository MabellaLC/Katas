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
        int accumulatedBalance = 0;
        List<StatementLine> statementLines = new ArrayList<>();
        for (Transaction transaction: transactionsList){
            statementLines.add(transaction.generateStatementLine(accumulatedBalance));
            accumulatedBalance += transaction.amount();
        }

        return new Statement(statementLines);

    }
}
