import MarsRover.MarsRoverApp;
import org.junit.jupiter.api.Test;

import static MarsRover.BuilderPattern.MarsRoverBuilder.marsRoverBuilder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateMarsTest {

    @Test
    public void moves_left_when_pointing_north(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,2).withOrientation("W").build(), marsRover.move("l"));
    }

    @Test
    public void moves_right_when_pointing_north(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,2).withOrientation("E").build(), marsRover.move("r"));
    }

    @Test
    public void moves_right_when_pointing_est(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("E").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,2).withOrientation("S").build(), marsRover.move("r"));
    }

    @Test
    public void moves_left_when_pointing_est(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("E").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build(), marsRover.move("l"));
    }

    @Test
    public void moves_right_when_pointing_south(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("S").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,2).withOrientation("W").build(), marsRover.move("r"));
    }

    @Test
    public void moves_left_when_pointing_south(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("S").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,2).withOrientation("E").build(), marsRover.move("l"));
    }

    @Test
    public void moves_right_when_pointing_west(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("W").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build(), marsRover.move("r"));
    }

    @Test
    public void moves_left_when_pointing_west(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("W").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,2).withOrientation("S").build(), marsRover.move("l"));
    }
}
