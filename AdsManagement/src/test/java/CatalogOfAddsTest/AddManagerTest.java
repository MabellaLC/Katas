package CatalogOfAddsTest;

import CatalogOfAdds.AddManager;
import org.junit.jupiter.api.Test;

import static CatalogOfAddsTest.AddHelper.advertisementWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddManagerTest {
    @Test
    public void when_creating_an_advertisement(){
        AddManager addManager = advertisementWith(1,"Promoción", "Batas exclusivas", "26/04/2020");

        assertEquals(advertisementWith(1,"Promoción", "Batas exclusivas", "26/04/2020"), addManager);
    }


    @Test
    public void add_an_advertisement_to_a_catalog(){


    }
}
