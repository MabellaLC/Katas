package MarsRoversTests;

import MarsRover.MarsRover;
import org.junit.jupiter.api.Test;

import static MarsRoversTests.MarsRoverHelpersTest.aRoverAt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotatingRightTest {
    @Test
    public void when_facing_north(){
        MarsRover marsRover = aRoverAt(0,0, "N");

        marsRover.receive("r");

        assertEquals(aRoverAt(0,0, "E"), marsRover);
    }
}
