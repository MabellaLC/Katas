package CatalogOfAddsTest;

import CatalogOfAdds.AddManager;

public class AddHelper {

    public static AddManager advertisementWith(int iD, String title, String description, String date){
        return new AddManager(iD, title, description, date);
    }
}
