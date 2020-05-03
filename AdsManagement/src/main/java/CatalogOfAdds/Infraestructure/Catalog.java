package CatalogOfAdds.Infraestructure;

import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.ValueObjects.IdAdd;

public interface Catalog {
    void addAddToCatalog(Advertisement advertisement);
    String printAnAdd(IdAdd iD);
    String printListOfAdds();
}
