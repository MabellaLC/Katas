package BankAccount;

public class NiceEnglishFormatPrinter implements Printer {
    private Console console;

    public NiceEnglishFormatPrinter(Console console) {
        this.console = console;
    }

    @Override
    public void printStatement(Statement statement) {
        console.print("date || credit || debit || balance");
    }
}
