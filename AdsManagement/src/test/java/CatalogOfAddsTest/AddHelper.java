package CatalogOfAddsTest;

import CatalogOfAdds.Advertisement;

public class AddHelper {

    public static Advertisement advertisementWith(int iD, String title, String description, String date){
        return new Advertisement(iD, title, description, date);
    }
}
