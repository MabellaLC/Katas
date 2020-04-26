package CatalogOfAddsTest;

import CatalogOfAdds.AddManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddManagerTest {

    @Test
    public void add_an_advertisement_to_a_catalog(){
        AddManager addManager = new AddManager();

        addManager.addAdd(addManager);

       // assertEquals();

    }
}
