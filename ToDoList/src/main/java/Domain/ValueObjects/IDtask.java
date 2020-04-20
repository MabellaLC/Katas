package Domain.ValueObjects;

import java.util.Objects;

public class IDtask {
    private int IDtask;

    public IDtask(int IDtask) {
        this.IDtask = IDtask;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IDtask iDtask = (IDtask) o;
        return IDtask == iDtask.IDtask;
    }

    @Override
    public int hashCode() {
        return Objects.hash(IDtask);
    }

    @Override
    public String toString() {
        return "ID: " + IDtask;
    }
}
