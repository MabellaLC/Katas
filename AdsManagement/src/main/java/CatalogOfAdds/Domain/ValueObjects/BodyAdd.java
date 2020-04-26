package CatalogOfAdds.Domain.ValueObjects;

import CatalogOfAdds.Domain.Exceptions.AdvertisementFormat;

import java.util.Objects;

public class BodyAdd {
    private final String title;
    private final String description;

    public BodyAdd(String title, String description) {
        if (title.equals(description)){
            throw new AdvertisementFormat("Title and description can't be equals");
        }
        this.title = checkFormatTitle(title);
        this.description = description;
    }
    private String checkFormatTitle(String title){
        if(title.length() > 50){
            throw new AdvertisementFormat("Title can be longer than fifty characters");
        }
        return title;
    }

    @Override
    public String toString() {
        return "BodyAdd{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyAdd bodyAdd = (BodyAdd) o;
        return Objects.equals(title, bodyAdd.title) &&
                Objects.equals(description, bodyAdd.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description);
    }
}
