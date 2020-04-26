package CatalogOfAdds.ValueObjects;

import CatalogOfAdds.Exceptions.AdvertisementFormat;

import java.util.Objects;

public class Title {
    private String title;

    public Title(String title) {
        this.title = checkFormatTitle(title);
    }

    private String checkFormatTitle(String title){
        if(title.length() > 50){
            throw new AdvertisementFormat("Title can be longer than fifty characters");
        }
        return title;
    }

    @Override
    public String toString() {
        return "Title{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title1 = (Title) o;
        return Objects.equals(title, title1.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
