package CatalogOfAddsTest;

import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.AdvertsList;
import CatalogOfAdds.Domain.Calendar;
import CatalogOfAdds.Domain.ValueObjects.Date;
import CatalogOfAdds.Domain.ValueObjects.IdAdd;
import CatalogOfAdds.Infraestructure.Catalog;
import CatalogOfAdds.Infraestructure.CatalogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static helpers.AdvertisementBuilder.anAdvertisement;
import static helpers.AdvertsListFactory.aAdvertsListContaining;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CatalogTest {

    Calendar calendar;
    Catalog catalog;

    @BeforeEach
    public void setUp(){
        calendar = mock(Calendar.class);
        catalog = new CatalogRepository();

    }


    /*@Test
    public void generate_a_catalog_containing_an_advertisement_filter_by_id(){
        Advertisement addOne = anAdvertisement()
                .withID(1)
                .withTitle("Promoción de última moda")
                .withDescription("Batas exclusivas")
                .whenDateIs(new Date("20/04/2020")).build();

        catalog.addAddToCatalog(addOne);

        assertEquals(addOne, catalog.filterById(new IdAdd(1)));
//stic retornan un string hauria de ser un advert

    }*/



    @Test
    public void generates_a_catalog_containing_all_recorded_advertisements(){
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

        catalog.addAddToCatalog(addOne);
        catalog.addAddToCatalog(addTwo);
        String expectedString = "Id: 1"  + "\n" +
                "Title: Promoción de última moda" + "\n" +
                "Description: Batas exclusivas" + "\n" +
                "Date: 20/04/2020" + "\n" +
                "Id: 2"  + "\n" +
                "Title: Promoción" + "\n" +
                "Description: Bikinis" + "\n" +
                "Date: 26/04/2020" +"\n";

        assertEquals(catalog.printListOfAdds(), expectedString);
    }
}
