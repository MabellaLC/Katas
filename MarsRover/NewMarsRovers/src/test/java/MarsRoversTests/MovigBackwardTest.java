package MarsRoversTests;

import MarsRover.MarsRover;
import org.junit.jupiter.api.Test;

import static MarsRoversTests.MarsRoverHelpersTest.aRoverAt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovigBackwardTest {
    @Test
    public void when_facing_north(){
        MarsRover marsRover = aRoverAt(1, 5, "N");

        marsRover.receive("b");

        assertEquals(marsRover, aRoverAt(1,4, "N"));
    }
}
