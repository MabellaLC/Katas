
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

    @Test
    public void moving_forward_when_facing_east(){
        MarsRover marsRover = new MarsRover(1,3, "E");

        marsRover.receive("f");

        assertEquals(marsRover, new MarsRover(2,3, "E"));
    }

    @Test
    public void moving_forward_when_facing_south(){
        MarsRover marsRover = new MarsRover(5,3, "S");

        marsRover.receive("f");

        assertEquals(marsRover, new MarsRover(5, 2, "S"));
    }
    @Test
    public void moving_forward_when_facing_west(){
        MarsRover marsRover = new MarsRover(5,3, "W");

        marsRover.receive("f");

        assertEquals(marsRover, new MarsRover(4, 3, "W"));
    }
}
