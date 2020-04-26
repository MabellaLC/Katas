package CatalogOfAddsTest;

import CatalogOfAdds.Domain.AddManager;
import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Infraestructure.CatalogRepository;
import org.junit.jupiter.api.Test;

import static CatalogOfAddsTest.AddHelper.advertisementWith;
import static org.mockito.Mockito.*;

public class AddManagerTest {

    @Test
    public void add_an_advertisement_to_a_catalog() {
        CatalogRepository catalogRepository = mock(CatalogRepository.class);
        AddManager addManager = new AddManager(catalogRepository);

        Advertisement advertisement = advertisementWith(1, "Promoción", "Batas exclusivas", "26/04/2020");
        addManager.addAdd(advertisement);

        verify(catalogRepository).addAddToCatalog(advertisementWith(1, "Promoción", "Batas exclusivas", "26/04/2020"));
    }
}
