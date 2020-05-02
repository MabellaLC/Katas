package BankAccount;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NiceEnglishFormatPrinter implements Printer {
    private static final String STATEMENT_HEADER = "date || credit || debit || balance";
    private Console console;

    public NiceEnglishFormatPrinter(Console console) {
        this.console = console;
    }

    @Override
    public void printStatement(Statement statement) {
        printHeader();
        if (statement.lines().isEmpty()){
            return;
        }

        List<StatementLine> reversed = new ArrayList<>(statement.lines());
        Collections.reverse(reversed);
        reversed.forEach(this::printLine);
    }

    private void printLine(StatementLine statementLine) {
        console.print(formatLine(statementLine));
    }

    private String formatLine(StatementLine statementLine){
        return String.format(LineFormat(statementLine),
                formatDateOf(statementLine),
                formatAmountOf(statementLine),
                formatBalanceOf(statementLine));

    }

    private String LineFormat(StatementLine statementLine) {
        if (statementLine.isDebit()){
            return "%s ||  || %s || %s";
        }else {
            return  "%s || %s ||  || %s";
        }
    }

    private String formatBalanceOf(StatementLine statementLine){
        return String.format("%d.00", statementLine.balance());
    }

    private String formatAmountOf(StatementLine statementLine){
        return String.format("%d.00", Math.abs(statementLine.amount()));
    }

    private String formatDateOf(StatementLine statementLine) {
        return String.format("%s/%s/%s", statementLine.day(), statementLine.month(), statementLine.year());
    }

    private void printHeader() {
        console.print(STATEMENT_HEADER);
    }
}
