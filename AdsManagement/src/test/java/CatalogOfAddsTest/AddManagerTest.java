package CatalogOfAddsTest;

import CatalogOfAdds.Domain.AddManager;
import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.Exceptions.IdAddDoNotExist;
import CatalogOfAdds.Domain.Console;
import CatalogOfAdds.Domain.ValueObjects.IdAdd;
import CatalogOfAdds.Infraestructure.Catalog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static helpers.AdvertisementFactory.advertisementWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class AddManagerTest {
    Catalog catalog;
    Console console;
    AddManager addManager;

    @BeforeEach
    public void setUp() {
        catalog = mock(Catalog.class);
        console = mock(Console.class);
        addManager = new AddManager(catalog, console);

    }

    @Test
    public void add_an_advertisement_to_a_catalog() {
        Advertisement advertisement = advertisementWith(1, "Promoción", "Batas exclusivas", "26/04/2020");
        addManager.addAdd(advertisement);

        verify(catalog).addAddToCatalog(advertisementWith(1, "Promoción", "Batas exclusivas", "26/04/2020"));
    }

    @Test
    public void get_an_advertisement_from_catalog_by_id() {

        when(catalog.printAnAdd(new IdAdd(2))).thenReturn("Id: 2"  + "\n" +
                "Title: Promoción" + "\n" +
                "Description: Batas exclusivas" + "\n" +
                "Date: 26/04/2020");

        addManager.printAnAdd(2);

        verify(console).print("Id: 2"  + "\n" +
                "Title: Promoción" + "\n" +
                "Description: Batas exclusivas" + "\n" +
                "Date: 26/04/2020");
    }

    /*@Test
    public void raise_error_when_printing_an_advertisement_that_id_do_not_exist() {
//        Advertisement advertisement = advertisementWith(2, "Promoción", "Batas exclusivas", "26/04/2020");
//        addManager.addAdd(advertisement);
//        addManager.printAnAdd(2);
        when(catalog.printAnAdd(new IdAdd(2))).thenReturn("Id: 2"  + "\n" +
                "Title: Promoción" + "\n" +
                "Description: Batas exclusivas" + "\n" +
                "Date: 26/04/2020");

        assertThrows(IdAddDoNotExist.class, () -> addManager.printAnAdd(3));
    }*/

//La vaina esta en que mockejo les dos, hauria de fer una class intermitja per rebre una llista
    /*@Test
    public void get_a_list_of_advertisement_from_catalog() {
        CatalogRepository catalogRepository = mock(CatalogRepository.class);
        Printer printer = mock(Printer.class);
        AddManager addManager = new AddManager(catalogRepository, printer);

        Advertisement firstAdvertisement = advertisementWith(1, "Promoción", "Batas exclusivas", "26/04/2020");
        Advertisement secondAdvertisement = advertisementWith(2, "Rebajas", "Bañadores", "26/04/2020");

        List<Advertisement> advertisementList = new ArrayList<>();
        advertisementList.add(firstAdvertisement);
        advertisementList.add(secondAdvertisement);
        when(catalogRepository.getAddList()).thenReturn(advertisementList);

        addManager.printListOfAdds();


        verify(printer).printAnAdd("Id: 1"  + "\n" +
                "Title: Promoción" + "\n" +
                "Description: Batas exclusivas" + "\n" +
                "Date: 26/04/2020");
        verify(printer).printAnAdd("Id: 2"  + "\n" +
                "Title: Rebajas" + "\n" +
                "Description: Bañadores" + "\n" +
                "Date: 26/04/2020");
    }*/

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
