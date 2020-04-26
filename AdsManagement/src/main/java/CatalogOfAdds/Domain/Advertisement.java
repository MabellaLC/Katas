package CatalogOfAdds.Domain;

import CatalogOfAdds.Domain.ValueObjects.BodyAdd;
import CatalogOfAdds.Domain.ValueObjects.Date;
import CatalogOfAdds.Domain.ValueObjects.IdAdd;

import java.util.Objects;


public class Advertisement {
    private IdAdd iD;
    private Date date;
    private BodyAdd bodyAdd;

    public Advertisement(int iD, String title, String description, String date) {
        this.iD = new IdAdd(iD);
        this.date = new Date(date);
        this.bodyAdd = new BodyAdd(title,description);
    }


    @Override
    public String toString() {
        return "Advertisement{" +
                "iD=" + iD +
                ", date=" + date +
                ", bodyAdd=" + bodyAdd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisement that = (Advertisement) o;
        return Objects.equals(iD, that.iD) &&
                Objects.equals(date, that.date) &&
                Objects.equals(bodyAdd, that.bodyAdd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, date, bodyAdd);
    }
}
