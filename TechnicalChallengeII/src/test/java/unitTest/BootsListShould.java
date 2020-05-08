package unitTest;

import clickSystem.Domain.valueObjects.IDUser;
import clickSystem.insfraestructure.UserBoots;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BootsListShould {

    @Test
    public void have_a_predeterminate_list_of_boots(){
        UserBoots userBoots = new UserBoots();
        UserBoots seconduserBoots = new UserBoots();
        assertEquals(seconduserBoots, userBoots);
    }

    @Test
    public void have_a_predeterminate_list_of_boots_using_get(){
        UserBoots userBoots = new UserBoots();

        assertEquals(userBoots.toString(), userBoots.getBootsList().toString());
    }



}
