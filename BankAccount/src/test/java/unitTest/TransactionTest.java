package unitTest;

import BankAccount.Date;
import BankAccount.StatementLine;
import BankAccount.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {
    @Test
    public void generate_statement_line(){
        int accumulatedBalance = 2000;
        Date transactionDate = new Date("12-04-2005");
        int transactionAmount = 500;
        Transaction transaction = new Transaction(transactionDate, transactionAmount);

        assertEquals(transaction.generateStatementLine(accumulatedBalance), new StatementLine(transactionDate, transactionAmount, 2500));
    }

}
