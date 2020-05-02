package acceptance;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import BankAccount.*;

public class PrintingAccountStatementOnConsoleTest {

    @Test
    public void printing_statement_including_deposit_and_withdrawal(){
        Calendar calendar = mock(Calendar.class);
        Console console = mock(Console.class);
        Account account = new Account(
                new InMemoryTransactions(calendar),
                new NiceEnglishFormatPrinter(console));

        when(calendar.day()).thenReturn(new Date("10-01-2012"), new Date("13-01-2012"), new Date("14-01-2012") );

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();

        verify(console).print("date || credit || debit || balance");
        verify(console).print("14/01/2012 ||  || 500.00 || 2500.00");
        verify(console).print("13/01/2012 || 2000.00 ||  || 3000.00");
        verify(console).print("10/01/2012 || 1000.00 ||  || 1000.00");
    }
}
