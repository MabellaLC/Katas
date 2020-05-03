package CatalogOfAddsTest;

import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.Exceptions.AdvertisementFormat;
import CatalogOfAdds.Domain.ValueObjects.Date;
import org.junit.jupiter.api.Test;

import static helpers.AdvertisementBuilder.anAdvertisement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdvertisementTest {

    @Test
    public void creating_an_advertisement(){
        Advertisement advertisement = anAdvertisement()
                .withID(1)
                .withTitle("Promoción")
                .withDescription("Batas exclusivas")
                .whenDateIs(new Date("26/04/2020")).build();

        assertEquals(new Advertisement(
                1,"Promoción", "Batas exclusivas", new Date("26/04/2020"))
                , advertisement);
    }

    @Test
    public void raise_error_when_title_has_more_than_fifty_characters(){

        assertThrows(AdvertisementFormat.class, () ->  anAdvertisement()
                                            .withID(1)
                                            .withTitle("Promoción de última moda para señoras en toda la gama de pijamas")
                                            .withDescription("Batas exclusivas")
                                            .whenDateIs(new Date("26/04/2020")).build());
    }

    @Test
    public void raise_error_when_creating_an_advertisement_with_same_title_and_description(){
        assertThrows(AdvertisementFormat.class, () -> anAdvertisement()
                                        .withID(1)
                                        .withTitle("Promoción")
                                        .withDescription("Promoción")
                                        .whenDateIs(new Date("26/04/2020")).build());

    }
}
