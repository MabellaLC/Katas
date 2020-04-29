package CatalogOfAdds.Domain;

import CatalogOfAdds.Domain.ValueObjects.IdAdd;
import CatalogOfAdds.Infraestructure.CatalogRepository;

public class AddManager {
    private CatalogRepository catalogRepository;
    private Printer printer;

    public AddManager(CatalogRepository catalogRepository, Printer printer) {
        this.catalogRepository = catalogRepository;
        this.printer = printer;
    }

    public void addAdd(Advertisement addManager) {
        catalogRepository.addAddToCatalog(addManager);
    }

    public void remove(Advertisement advertisement){

    }

    public void printAnAdd(int iD){
        IdAdd idAdd = new IdAdd(iD);
        printer.printAnAdd(catalogRepository.printAnAdd(idAdd));
    }

    public void printListOfAdds(){
        printer.printAnAdd(catalogRepository.printListOfAdds());
    }
}
