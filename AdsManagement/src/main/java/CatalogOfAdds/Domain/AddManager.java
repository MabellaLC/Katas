package CatalogOfAdds.Domain;

import CatalogOfAdds.Domain.ValueObjects.IdAdd;
import CatalogOfAdds.Infraestructure.Catalog;

public class AddManager {
    private Catalog catalog;
    private Console printer;

    public AddManager(Catalog catalog, Console printer) {
        this.catalog = catalog;
        this.printer = printer;
    }

    public void addAdd(Advertisement addManager) {

        catalog.addAddToCatalog(addManager);
    }

    public void remove(Advertisement advertisement){

    }

    public void printAnAdd(int iD){
        IdAdd idAdd = new IdAdd(iD);
        printer.print(catalog.printAnAdd(idAdd));
    }

    public void printListOfAdds(){
        printer.print(catalog.printListOfAdds());
    }
}
