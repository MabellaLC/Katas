package helpers;

import BankAccount.Statement;
import BankAccount.StatementLine;

import java.util.ArrayList;
import java.util.Arrays;

public class StatementFactory {
    public static Statement aStatementContaining(StatementLine... statementLine){
        return new Statement(Arrays.asList(statementLine));
    }

    public static Statement anEmptyStatement() {
        return new Statement(new ArrayList<>());
    }

    public static Statement anyStatement() {
        return anEmptyStatement();
    }
}
