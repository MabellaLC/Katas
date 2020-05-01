package unitTest;

import BankAccount.Console;
import BankAccount.NiceEnglishFormatPrinter;
import BankAccount.Printer;
import BankAccount.Statement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static helpers.StatementFactory.anEmptyStatement;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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


}
