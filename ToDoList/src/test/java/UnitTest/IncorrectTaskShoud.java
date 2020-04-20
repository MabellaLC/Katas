package UnitTest;

import Domain.*;
import Domain.ValueObjects.IDtask;
import Domain.ValueObjects.TaskName;
import Exceptions.TaskFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class IncorrectTaskShoud {

    @Test
    public void raise_error_when_a_task_has_less_than_five_characters(){

        assertThrows(TaskFormat.class, () -> new Task(new IDtask(1), new TaskName("Sal"), "21/04/2020"));
    }

    @Test
    public void raise_error_when_a_task_has_more_than_twenty_characters(){

        assertThrows(TaskFormat.class, () -> new Task(new IDtask(1), new TaskName("Salir a pasear al perro del vecino"), "21/04/2020"));
    }

    @Test
    public void raise_error_when_a_task_has_non_alphanumerical_characters(){

        assertThrows(TaskFormat.class, () -> new Task(new IDtask(1), new TaskName("Salir_con*mascarilla?"), "21/04/2020"));
    }


}
