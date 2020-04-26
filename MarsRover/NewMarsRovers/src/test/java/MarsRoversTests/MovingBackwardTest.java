package MarsRoversTests;

import MarsRover.MarsRover;
import org.junit.jupiter.api.Test;

import static MarsRoversTests.MarsRoverBuilder.aRover;
import static MarsRoversTests.MarsRoverHelpersTest.roverLocatedAt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovingBackwardTest {
    @Test
    public void when_facing_north(){
        MarsRover marsRover = aRover().at(1,5).facing("N").build();

        marsRover.receive("b");

        assertEquals(marsRover, roverLocatedAt(1,4, "N"));
    }

    @Test
    public void when_facing_east(){
        MarsRover marsRover = aRover().at(1,5).facing("E").build();

        marsRover.receive("b");

        assertEquals(marsRover, roverLocatedAt(0,5, "E"));
    }

    @Test
    public void when_facing_south(){
        MarsRover marsRover = aRover().at(1,5).facing("S").build();

        marsRover.receive("b");

        assertEquals(marsRover, roverLocatedAt(1,6, "S"));
    }

    @Test
    public void when_facing_west(){
        MarsRover marsRover = aRover().at(1,5).facing("W").build();

        marsRover.receive("b");

        assertEquals(marsRover, roverLocatedAt(2,5, "W"));
    }
}
