import MarsRover.MarsRover;
import org.junit.jupiter.api.Test;

import static MarsRoversTests.MarsRoverHelpersTest.aRoverAt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovingFordwareTest {
    @Test
    public void _when_facing_north(){
        MarsRover marsRover = aRoverAt(3,6, "N");

        marsRover.receive("f");

        assertEquals(marsRover, aRoverAt(3,7, "N"));
    }

    @Test
    public void moving_forward_when_facing_east(){
        MarsRover marsRover = aRoverAt(1,3, "E");

        marsRover.receive("f");

        assertEquals(marsRover, aRoverAt(2,3, "E"));
    }

    @Test
    public void moving_forward_when_facing_south(){
        MarsRover marsRover = aRoverAt(5,3, "S");

        marsRover.receive("f");

        assertEquals(marsRover, aRoverAt(5, 2, "S"));
    }
    @Test
    public void moving_forward_when_facing_west(){
        MarsRover marsRover = aRoverAt(5,3, "W");

        marsRover.receive("f");

        assertEquals(marsRover, aRoverAt(4, 3, "W"));
    }



}
