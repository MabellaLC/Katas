package CatalogOfAdds.Domain;

import CatalogOfAdds.Infraestructure.CatalogRepository;

public class AddManager {
    CatalogRepository catalogRepository;

    public AddManager(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public void addAdd(Advertisement addManager) {
        catalogRepository.addAddToCatalog(addManager);
    }

    public void remove(Advertisement advertisement){

    }

    public void get_PrintAnAdd(Advertisement advertisement){

    }

    public void printListOfAdds(){

    }


}
