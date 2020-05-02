package helpers;

import BankAccount.Statement;
import BankAccount.StatementLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StatementFactory {
    public static Statement aStatementContaining(StatementLine... statementLine){
        return new Statement(Arrays.asList(statementLine));
    }

    public static Statement aStatementContaining(StatementLineBuilder... statementLineBuilders){
        List<StatementLine> statementLines = Arrays.asList(statementLineBuilders).stream()
                .map(statementLineBuilder -> statementLineBuilder.build())
                .collect(Collectors.toList());

        return new Statement(statementLines);
    }

    public static Statement anEmptyStatement() {
        return new Statement(new ArrayList<>());
    }

    public static Statement anyStatement() {
        return anEmptyStatement();
    }
}
