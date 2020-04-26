package CatalogOfAddsTest;

import CatalogOfAdds.Advertisement;
import CatalogOfAdds.Exceptions.AdvertisementFormat;
import org.junit.jupiter.api.Test;

import static CatalogOfAddsTest.AddHelper.advertisementWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdvertisementTest {

    @Test
    public void when_creating_an_advertisement(){
        Advertisement advertisement = advertisementWith(1,"Promoción", "Batas exclusivas", "26/04/2020");

        assertEquals(new Advertisement(1,"Promoción", "Batas exclusivas", "26/04/2020"), advertisement);
    }

    @Test
    public void not_creating_when_title_has_more_than_fifty_characters(){

        assertThrows(AdvertisementFormat.class, () -> advertisementWith(1,"Promoción de última moda para " +
                                                                        "señoras en toda la gama de pijamas",
                                                                        "Batas exclusivas",
                                                                        "26/04/2020"));
    }

    @Test
    public void when_creating_an_advertisement_with_same_title_and_description(){
        assertThrows(AdvertisementFormat.class, () -> advertisementWith(1,"Promoción",
                "Promoción",
                "26/04/2020"));
    }
}