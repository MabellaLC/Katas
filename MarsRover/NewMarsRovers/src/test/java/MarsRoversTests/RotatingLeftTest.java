package MarsRoversTests;

import MarsRover.MarsRover;
import org.junit.jupiter.api.Test;

import static MarsRoversTests.MarsRoverBuilder.aRover;
import static MarsRoversTests.MarsRoverHelpersTest.roverLocatedAt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotatingLeftTest {
    @Test
    public void when_facing_north(){
        MarsRover marsRover = aRover().at(0,0).facing("N").build();

        marsRover.receive("l");

        assertEquals(roverLocatedAt(0,0, "W"), marsRover);
    }
    @Test
    public void when_facing_east(){
        MarsRover marsRover = aRover().at(0,0).facing("E").build();

        marsRover.receive("l");

        assertEquals(roverLocatedAt(0,0, "N"), marsRover);
    }
    @Test
    public void when_facing_south(){
        MarsRover marsRover = aRover().at(0,0).facing("S").build();

        marsRover.receive("l");

        assertEquals(roverLocatedAt(0,0, "E"), marsRover);
    }
    @Test
    public void when_facing_west(){
        MarsRover marsRover = aRover().at(0,0).facing("W").build();

        marsRover.receive("l");

        assertEquals(roverLocatedAt(0,0, "S"), marsRover);
    }
}
