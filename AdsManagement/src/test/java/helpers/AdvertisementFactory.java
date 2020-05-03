package helpers;

import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.ValueObjects.Date;

public class AdvertisementFactory {

    public static Advertisement advertisementWith(int iD, String title, String description, Date date){
        return new Advertisement(iD, title, description, date);
    }
}
