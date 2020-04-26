package CatalogOfAdds.Infraestructure;

import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.Exceptions.IdAddDoNotExist;
import CatalogOfAdds.Domain.Printer;
import CatalogOfAdds.Domain.ValueObjects.IdAdd;

import java.util.ArrayList;
import java.util.List;

public class CatalogRepository {

    List<Advertisement> advertisementList = new ArrayList<>();


    public void addAddToCatalog(Advertisement advertisement) {
        advertisementList.add(advertisement);
    }

    public String printAnAdd(IdAdd iD) {
        for (Advertisement advertisement: advertisementList) {
            if (advertisement.getiD().equals(iD)){
                return advertisement.toString();
            }
        }
        throw new IdAddDoNotExist("Id doesn't exist");
    }

    public void printListOfAdds() {

    }
}
