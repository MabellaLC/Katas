import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvertisementTest {

    @Test
    public void when_creating_an_advertisement(){

        Advertisement advertisement = new Advertisement(1,"Promoción", "Batas exclusivas", "26/04/2020");

        assertEquals(new Advertisement(1,"Promoción", "Batas exclusivas", "26/04/2020"), advertisement);
    }


}
