package BankAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Statement {
    private List<StatementLine> statementLines;

    public Statement(List<StatementLine> statementLines) {

        this.statementLines = statementLines;
    }

    public List<StatementLine> lines() {
        return new ArrayList<>(statementLines);
    }

    public List<StatementLine> linesInReverseOrder() {
        List<StatementLine> reversed = new ArrayList<>(statementLines);
        Collections.reverse(reversed);
        return reversed;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "statementLines=" + statementLines +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statement statement = (Statement) o;
        return Objects.equals(statementLines, statement.statementLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statementLines);
    }
}
