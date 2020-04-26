package CatalogOfAdds;

import java.util.Objects;

public class Advertisement {
    private final int iD;
    private final String description;
    private final String date;
    private Title title;

    public Advertisement(int iD, String title, String description, String date) {
        this.iD = iD;
        this.description = description;
        this.date = date;
        this.title = new Title(title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisement that = (Advertisement) o;
        return iD == that.iD &&
                Objects.equals(description, that.description) &&
                Objects.equals(date, that.date) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, description, date, title);
    }
}
