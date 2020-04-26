package CatalogOfAdds.Domain.ValueObjects;

import java.util.Objects;

public class IdAdd {
    private int iD;

    public IdAdd(int iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "IdAdd{" +
                "iD=" + iD +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdAdd idAdd = (IdAdd) o;
        return iD == idAdd.iD;
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD);
    }
}
