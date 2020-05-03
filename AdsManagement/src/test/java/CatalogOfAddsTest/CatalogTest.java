package CatalogOfAddsTest;

import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.AdvertsList;
import CatalogOfAdds.Domain.Calendar;
import CatalogOfAdds.Domain.ValueObjects.Date;
import CatalogOfAdds.Infraestructure.Catalog;
import CatalogOfAdds.Infraestructure.CatalogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static helpers.AdvertisementFactory.advertisementWith;
import static helpers.AdvertsListFactory.aAdvertsListContaining;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatalogTest {

    Calendar calendar;
    Catalog catalog;

    @BeforeEach
    public void setUp(){
        calendar = mock(Calendar.class);
        catalog = new CatalogRepository();
    }


    @Test
    public void generates_a_catalog_containing_all_recorded_advertisements(){
        Advertisement addOne = advertisementWith(1,"Promoción de última moda",
                "Batas exclusivas",
                "20/04/2020");
        Advertisement addTwo = advertisementWith(2, "Promoción", "Bikinis", "26/04/2020");

        AdvertsList expectedAdsList = aAdvertsListContaining(
                addOne,
                addTwo
        );

        catalog.addAddToCatalog(addOne);
        catalog.addAddToCatalog(addTwo);

        //when(calendar.date()).thenReturn(new Date("20/04/2020"), new Date("26/04/2020"));

        assertEquals(expectedAdsList, catalog.printListOfAdds());
    }
}
