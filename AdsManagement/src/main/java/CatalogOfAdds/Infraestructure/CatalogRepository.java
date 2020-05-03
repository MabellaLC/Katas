package CatalogOfAdds.Infraestructure;

import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.AdvertsList;
import CatalogOfAdds.Domain.Exceptions.IdAddDoNotExist;
import CatalogOfAdds.Domain.ValueObjects.IdAdd;

import java.util.ArrayList;
import java.util.List;

public class CatalogRepository implements Catalog{

    List<Advertisement> advertisementList = new ArrayList<>();
    //Calendar
    //constructor recive calendar

    //void record(int amount)
    @Override
    public void addAddToCatalog(Advertisement advertisement) {

        advertisementList.add(advertisement);
    }

    @Override
    public String printAnAdd(IdAdd iD) {
        //mirar cambiarlo por el stream
        for (Advertisement advertisement: advertisementList) {
            if (advertisement.getiD().equals(iD)){
                return advertisement.toString();
            }
        }
        throw new IdAddDoNotExist("Id doesn't exist");
    }

    //public Statement()
    //list statementLine = new array...
    @Override
    public AdvertsList printListOfAdds() {
        List<Advertisement> transactionsStrings = new ArrayList<>();
        for (Advertisement advertisement : advertisementList) {
            transactionsStrings.add(advertisement);
        }
       return new AdvertsList(transactionsStrings);
    }



}
