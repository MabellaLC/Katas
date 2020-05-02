package unitTest;

import BankAccount.*;
import helpers.StatementLineBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static helpers.StatementFactory.aStatementContaining;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
                StatementLineBuilder.aStatementLine()
                        .from(new Date("10-05-2016"))
                        .ofAmount(500)
                        .andBalance(500)
                        .build(),
                StatementLineBuilder.aStatementLine()
                        .from(new Date("15-05-2016"))
                        .ofAmount(-200)
                        .andBalance(300)
                        .build()
        );
        when(calendar.day()).thenReturn(new Date("10-05-2016"),new Date("15-05-2016"));

        transactions.record(500);
        transactions.record(-200);
        assertEquals(transactions.statement(), expectedStatement);
    }


}
