package helpers;

import CatalogOfAdds.Domain.Advertisement;

public class AdvertisementFactory {

    public static Advertisement advertisementWith(int iD, String title, String description, String date){
        return new Advertisement(iD, title, description, date);
    }
}
