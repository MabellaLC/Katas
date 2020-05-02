package unitTest;

import BankAccount.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static helpers.StatementFactory.*;
import static helpers.StatementLineBuilder.aStatementLine;
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
                aStatementLine().from(new Date("14-04-2012")).ofAmount(-600).andBalance(1000).build()));

        verify(console).print("date || credit || debit || balance");
        verify(console).print("14/04/2012 ||  || 600.00 || 1000.00");
    }

    @Test
    public void  prints_a_statement_containing_a_credit_line(){
        printer.printStatement(aStatementContaining(
                aStatementLine().from(new Date("13-01-2012")).ofAmount(2000).andBalance(3000).build()));


        verify(console).print("date || credit || debit || balance");
        verify(console).print("13/01/2012 || 2000.00 ||  || 3000.00");
    }

    @Test
    public void  prints_a_statement_containing_a_debit_and_credit_line_in_reverse_oder(){
        printer.printStatement(aStatementContaining(
                aStatementLine().from(new Date("13-01-2012")).ofAmount(2000).andBalance(3000).build(),
                aStatementLine().from(new Date("14-04-2012")).ofAmount(-500).andBalance(2500).build()
        ));

        verify(console).print("date || credit || debit || balance");
        verify(console).print("14/04/2012 ||  || 500.00 || 2500.00");
        verify(console).print("13/01/2012 || 2000.00 ||  || 3000.00");

    }
}
