package helpers;

import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.ValueObjects.Date;

public class AdvertisementBuilder {
    private Date date;
    private String title;
    private String description;
    private int iD;

    public static AdvertisementBuilder anAdvertisement(){
        return new AdvertisementBuilder();
    }

    public AdvertisementBuilder withID(int iD){
        this.iD = iD;
        return this;
    }

    public AdvertisementBuilder withTitle(String title){
        this.title = title;
        return this;
    }

    public AdvertisementBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public AdvertisementBuilder whenDateIs(Date date){
        this.date = date;
        return this;
    }

    public Advertisement build(){
        return  new Advertisement(iD, title, description, date);
    }
}
