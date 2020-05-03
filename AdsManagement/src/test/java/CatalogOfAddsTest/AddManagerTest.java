package CatalogOfAddsTest;

import CatalogOfAdds.Domain.AddManager;
import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.Console;
import CatalogOfAdds.Domain.Exceptions.IdAddDoNotExist;
import CatalogOfAdds.Domain.ValueObjects.Date;
import CatalogOfAdds.Domain.ValueObjects.IdAdd;
import CatalogOfAdds.Infraestructure.Catalog;
import CatalogOfAdds.Infraestructure.CatalogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static helpers.AdvertisementBuilder.anAdvertisement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class AddManagerTest {
    Catalog catalog;
    Console console;
    AddManager addManager;

    @BeforeEach
    public void setUp() {
        console = mock(Console.class);
    }

    @Test
    public void add_an_advertisement_to_a_catalog() {
        catalog = mock(Catalog.class);
        addManager = new AddManager(catalog, console);

        Advertisement advertisement = anAdvertisement()
                .withID(1)
                .withTitle("Promoción")
                .withDescription("Batas exclusivas")
                .whenDateIs(new Date("26/04/2020")).build();

        addManager.addAdd(advertisement);

        verify(catalog).addAddToCatalog(anAdvertisement()
                .withID(1)
                .withTitle("Promoción")
                .withDescription("Batas exclusivas")
                .whenDateIs(new Date("26/04/2020")).build());
    }

    @Test
    public void get_an_advertisement_from_catalog_by_id() {
        catalog = mock(Catalog.class);
        addManager = new AddManager(catalog, console);
        Advertisement advertisement = anAdvertisement()
                .withID(2)
                .withTitle("Promoción")
                .withDescription("Batas exclusivas")
                .whenDateIs(new Date("26/04/2020")).build();

        when(catalog.filterById(new IdAdd(2))).thenReturn(advertisement.toString());

        addManager.filterById(2);

        verify(console).print("Id: 2"  + "\n" +
                "Title: Promoción" + "\n" +
                "Description: Batas exclusivas" + "\n" +
                "Date: 26/04/2020");
    }

    @Test
    public void raise_error_when_filter_id_not_exist() {
        catalog = new CatalogRepository();
        addManager = new AddManager(catalog, console);

        assertThrows(IdAddDoNotExist.class, () -> addManager.filterById(3));
    }

    @Test
    public void print_a_list_of_advertisements(){
        catalog = new CatalogRepository();
        addManager = new AddManager(catalog, console);
        Advertisement addOne = anAdvertisement()
                .withID(1)
                .withTitle("Promoción de última moda")
                .withDescription("Batas exclusivas")
                .whenDateIs(new Date("20/04/2020")).build();
        Advertisement addTwo =anAdvertisement()
                .withID(2)
                .withTitle("Promoción")
                .withDescription("Bikinis")
                .whenDateIs(new Date("26/04/2020")).build();

        addManager.addAdd(addOne);
        addManager.addAdd(addTwo);
        addManager.printListOfAdds();

        String expectedString = "Id: 1"  + "\n" +
                "Title: Promoción de última moda" + "\n" +
                "Description: Batas exclusivas" + "\n" +
                "Date: 20/04/2020" + "\n" +
                "Id: 2"  + "\n" +
                "Title: Promoción" + "\n" +
                "Description: Bikinis" + "\n" +
                "Date: 26/04/2020" +"\n";


        verify(console).print(expectedString);
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
