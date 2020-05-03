package CatalogOfAdds.Domain;

import CatalogOfAdds.Domain.ValueObjects.IdAdd;
import CatalogOfAdds.Infraestructure.Catalog;

public class AddManager {
    private Catalog catalog;
    private Console console;

    public AddManager(Catalog catalog, Console printer) {
        this.catalog = catalog;
        this.console = printer;
    }

    public void addAdd(Advertisement addManager) {

        catalog.addAddToCatalog(addManager);
    }

    public void remove(Advertisement advertisement){

    }

    public void filterById(int iD){
        IdAdd idAdd = new IdAdd(iD);
       //catalog.filterById(idAdd);
        console.print(catalog.filterById(idAdd));
    }

    public void printListOfAdds(){
        console.print(catalog.printListOfAdds());
        //catalog.printListOfAdds();
    }
}
