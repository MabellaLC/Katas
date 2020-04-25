package MarsRoversTests;

import MarsRover.Direction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionsCreationTest {
    @Test
    public void direction_pointing_north(){
        Direction direction = Direction.pointingTo("N");

        assertEquals(direction, Direction.NORTH);
    }

    @Test
    public void direction_pointing_South(){
        Direction direction = Direction.pointingTo("S");

        assertEquals(direction, Direction.SOUTH);
    }
}
