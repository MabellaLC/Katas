package unitTest;

import BankAccount.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static helpers.StatementFactory.aStatementContaining;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TransactionsTest {
    Transactions transactions;
    Calendar calendar;

    @BeforeEach
    public void setUp(){
        calendar = mock(Calendar.class);
        transactions = new InMemoryTransactions(calendar);
    }


    @Test
    public void generates_an_account_statement_containing_all_recorded_transaction(){
        Statement expectedStatement = aStatementContaining(
                new StatementLine(new Date("10-05-2016"), 500, 500),
                new StatementLine(new Date("15-05-2016"), -200, 300)
        );
        when(calendar.day()).thenReturn(new Date("10-05-2016"),new Date("15-05-2016"));

        transactions.record(500);
        transactions.record(-200);
        assertEquals(transactions.statement(), expectedStatement);
    }


}
