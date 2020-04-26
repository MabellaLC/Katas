package CatalogOfAdds;

import java.util.Objects;

public class AddManager {
    private final int iD;
    private final String title;
    private final String description;
    private final String date;

    public AddManager(int iD, String title, String description, String date) {
        this.iD = iD;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddManager that = (AddManager) o;
        return iD == that.iD &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, title, description, date);
    }

    @Override
    public String toString() {
        return "AddManager{" +
                "iD=" + iD +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
