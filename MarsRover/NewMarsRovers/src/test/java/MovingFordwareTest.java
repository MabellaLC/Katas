import MarsRover.MarsRover;
import org.junit.jupiter.api.Test;

import static MarsRoversTests.MarsRoverBuilder.aRover;
import static MarsRoversTests.MarsRoverHelpersTest.aRoverAt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovingFordwareTest {
    @Test
    public void _when_facing_north(){
        MarsRover marsRover = aRover().at(3,6).facing("N").build();

        marsRover.receive("f");

        assertEquals(marsRover, aRoverAt(3,7, "N"));
    }

    @Test
    public void moving_forward_when_facing_east(){
        MarsRover marsRover = aRover().at(1,3).facing("E").build();

        marsRover.receive("f");

        assertEquals(marsRover, aRoverAt(2,3, "E"));
    }

    @Test
    public void moving_forward_when_facing_south(){
        MarsRover marsRover = aRover().at(5,3).facing("S").build();

        marsRover.receive("f");

        assertEquals(marsRover, aRoverAt(5, 2, "S"));
    }
    @Test
    public void moving_forward_when_facing_west(){
        MarsRover marsRover = aRover().at(5,3).facing("W").build();

        marsRover.receive("f");

        assertEquals(marsRover, aRoverAt(4, 3, "W"));
    }



}
