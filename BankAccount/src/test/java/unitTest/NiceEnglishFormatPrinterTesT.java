package unitTest;

import BankAccount.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static helpers.StatementFactory.*;
import static org.mockito.Mockito.*;

public class NiceEnglishFormatPrinterTesT {
    Console console;
    Printer printer;

    @BeforeEach
    public void setUp(){
        console = mock(Console.class);
        printer = new NiceEnglishFormatPrinter(console);
    }

    @Test
    public void prints_only_the_header_when_the_statement_is_empty(){
        printer.printStatement(anEmptyStatement());

        verify(console).print("date || credit || debit || balance");
    }

    @Test
    public void  prints_a_statement_containing_a_debit_line(){
        printer.printStatement(aStatementContaining(
                new StatementLine(new Date("14-01-2012"), -600, 1000)
        ));

        verify(console).print("date || credit || debit || balance");
        verify(console).print("14/04/2012 ||  || 600.00 || 1000.00");
    }
}
