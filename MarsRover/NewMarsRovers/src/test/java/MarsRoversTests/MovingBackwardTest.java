package MarsRoversTests;

import MarsRover.MarsRover;
import org.junit.jupiter.api.Test;

import static MarsRoversTests.MarsRoverHelpersTest.aRoverAt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovingBackwardTest {
    @Test
    public void when_facing_north(){
        MarsRover marsRover = aRoverAt(1, 5, "N");

        marsRover.receive("b");

        assertEquals(marsRover, aRoverAt(1,4, "N"));
    }

    @Test
    public void when_facing_east(){
        MarsRover marsRover = aRoverAt(1, 5, "E");

        marsRover.receive("b");

        assertEquals(marsRover, aRoverAt(0,5, "E"));
    }

    @Test
    public void when_facing_south(){
        MarsRover marsRover = aRoverAt(1, 5, "S");

        marsRover.receive("b");

        assertEquals(marsRover, aRoverAt(1,6, "S"));
    }

    @Test
    public void when_facing_west(){
        MarsRover marsRover = aRoverAt(1, 5, "W");

        marsRover.receive("b");

        assertEquals(marsRover, aRoverAt(2,5, "W"));
    }

}
