package unitTest;

import BankAccount.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static helpers.StatementFactory.anyStatement;
import static org.mockito.Mockito.*;

public class AccountTest {
    private static final int AMOUNT = 500;
    Transactions transactions;
    Printer printer;
    Account account;

    @BeforeEach
    public void setUp() {
        transactions = mock(Transactions.class);
        printer = mock(Printer.class);
        account = new Account(transactions, printer);
    }

    @Test
    public void deposit_an_amount(){
        account.deposit(AMOUNT);

        verify(transactions).record(AMOUNT);
    }

    @Test
    public void withdraw_an_amount(){
        account.withdraw(AMOUNT);

        verify(transactions).record(-AMOUNT);
    }

    @Test
    public void generate_account_transactions_statement_gets_printed(){
        Statement generatedStatement = anyStatement();
        when(transactions.statement()).thenReturn(generatedStatement);

        account.printStatement();

        verify(printer).printStatement(generatedStatement);
    }


}
