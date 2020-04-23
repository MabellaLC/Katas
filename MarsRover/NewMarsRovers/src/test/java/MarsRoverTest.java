
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void not_moving_when_receiving_empty_command_sequence(){
        MarsRover marsRover = new MarsRover(1,3, "N");

        marsRover.receive("");
        assertEquals(marsRover, new MarsRover(1,3, "N"));
    }
}
