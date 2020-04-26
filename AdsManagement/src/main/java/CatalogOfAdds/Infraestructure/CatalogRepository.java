package CatalogOfAdds.Infraestructure;

import CatalogOfAdds.Domain.Advertisement;

import java.util.ArrayList;
import java.util.List;

public class CatalogRepository {
    List<Advertisement> advertisementList = new ArrayList<>();

    public void addAddToCatalog(Advertisement advertisement) {
        advertisementList.add(advertisement);
    }
}
