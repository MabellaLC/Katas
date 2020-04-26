package CatalogOfAddsTest;

import CatalogOfAdds.Domain.Advertisement;

public class AddHelper {

    public static Advertisement advertisementWith(int iD, String title, String description, String date){
        return new Advertisement(iD, title, description, date);
    }
}
