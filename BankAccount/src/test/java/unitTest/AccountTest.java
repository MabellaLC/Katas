package unitTest;

import BankAccount.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class AccountTest {
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
        account.deposit(500);

        verify(transactions).record(500);
    }
}
