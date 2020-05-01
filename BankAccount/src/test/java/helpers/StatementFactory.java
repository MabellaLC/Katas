package helpers;

import BankAccount.Statement;

import java.util.ArrayList;

public class StatementFactory {
    public static Statement anEmptyStatement() {
        return new Statement(new ArrayList<>());
    }
}
