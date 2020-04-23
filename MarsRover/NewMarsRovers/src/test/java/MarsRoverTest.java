
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void not_moving_when_receiving_empty_command_sequence(){
        MarsRover marsRover = new MarsRover(1,3, "N");

        marsRover.receive("");

        assertEquals(marsRover, new MarsRover(1,3, "N"));
    }

    @Test
    public void moving_forward_when_facing_north(){
        MarsRover marsRover = new MarsRover(3,6, "N");

        marsRover.receive("f");

        assertEquals(marsRover, new MarsRover(3,7, "N"));
    }
}
