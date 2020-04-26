package CatalogOfAdds;

import CatalogOfAdds.ValueObjects.Date;
import CatalogOfAdds.ValueObjects.Description;
import CatalogOfAdds.ValueObjects.IdAdd;
import CatalogOfAdds.ValueObjects.Title;

import java.util.Objects;


public class Advertisement {
    private IdAdd iD;
    private Description description;
    private Date date;
    private Title title;

    public Advertisement(int iD, String title, String description, String date) {
        this.iD = new IdAdd(iD);
        this.title = new Title(title);
        this.description = new Description(description);
        this.date = new Date(date);

    }


    @Override
    public String toString() {
        return "Advertisement{" +
                "iD=" + iD +
                ", description=" + description +
                ", date=" + date +
                ", title=" + title +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisement that = (Advertisement) o;
        return Objects.equals(iD, that.iD) &&
                Objects.equals(description, that.description) &&
                Objects.equals(date, that.date) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, description, date, title);
    }
}
