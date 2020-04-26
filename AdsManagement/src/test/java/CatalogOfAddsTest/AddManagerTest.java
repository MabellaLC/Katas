package CatalogOfAddsTest;

import CatalogOfAdds.Domain.AddManager;
import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.Exceptions.IdAddDoNotExist;
import CatalogOfAdds.Domain.Printer;
import CatalogOfAdds.Infraestructure.CatalogRepository;
import org.junit.jupiter.api.Test;

import static CatalogOfAddsTest.AddHelper.advertisementWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class AddManagerTest {

    @Test
    public void add_an_advertisement_to_a_catalog() {
        CatalogRepository catalogRepository = mock(CatalogRepository.class);
        Printer printer = mock(Printer.class);

        AddManager addManager = new AddManager(catalogRepository, printer);

        Advertisement advertisement = advertisementWith(1, "Promoción", "Batas exclusivas", "26/04/2020");
        addManager.addAdd(advertisement);

        verify(catalogRepository).addAddToCatalog(advertisementWith(1, "Promoción", "Batas exclusivas", "26/04/2020"));
    }

    @Test
    public void get_an_advertisement_from_catalog_by_id() {
        CatalogRepository catalogRepository = new CatalogRepository();
        Printer printer = mock(Printer.class);
        AddManager addManager = new AddManager(catalogRepository, printer);

        Advertisement firstAdvertisement = advertisementWith(1, "Promoción", "Batas exclusivas", "26/04/2020");
        Advertisement secondAdvertisement = advertisementWith(2, "Promoción", "Batas exclusivas", "26/04/2020");
        addManager.addAdd(firstAdvertisement);
        addManager.addAdd(secondAdvertisement);

        addManager.printAnAdd(2);

        verify(printer).printAnAdd("Id: 2"  + "\n" +
                "Title: Promoción" + "\n" +
                "Description: Batas exclusivas" + "\n" +
                "Date: 26/04/2020");
    }
    @Test
    public void raise_error_when_print_an_advertisement_that_id_do_not_exist() {
        CatalogRepository catalogRepository = new CatalogRepository();
        Printer printer = mock(Printer.class);
        AddManager addManager = new AddManager(catalogRepository, printer);

        assertThrows(IdAddDoNotExist.class, () -> addManager.printAnAdd(2));
    }


    /*@Test
    public void remove_an_advertisement_from_a_catalog() {
        CatalogRepository catalogRepository = mock(CatalogRepository.class);
        AddManager addManager = new AddManager(catalogRepository);

        Advertisement firstAdvertisement = advertisementWith(1, "Promoción", "Batas exclusivas", "26/04/2020");
        Advertisement secondAdvertisement = advertisementWith(2, "Promoción", "Batas exclusivas", "26/04/2020");
        addManager.addAdd(firstAdvertisement);
        addManager.addAdd(secondAdvertisement);

        addManager.remove(firstAdvertisement);

        verify(catalogRepository).removeFromCatalog(advertisementWith(1, "Promoción", "Batas exclusivas", "26/04/2020"));
    }*/
}
