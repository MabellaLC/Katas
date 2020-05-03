package CatalogOfAdds.Infraestructure;

import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.AdvertsList;
import CatalogOfAdds.Domain.ValueObjects.IdAdd;


public interface Catalog {
    void addAddToCatalog(Advertisement advertisement);
    String filterById(IdAdd iD);
    String printListOfAdds();
}
