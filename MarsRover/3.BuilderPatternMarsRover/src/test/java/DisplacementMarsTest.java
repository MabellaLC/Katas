import MarsRover.MarsRoverApp;
import org.junit.jupiter.api.Test;

import static MarsRover.BuilderPattern.MarsRoverBuilder.marsRoverBuilder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisplacementMarsTest {
    @Test
    public void moves_forward_when_pointing_north(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,3).withOrientation("N").build(), marsRover.move("f"));
    }

    @Test
    public void moves_backward_when_pointing_north(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,1).withOrientation("N").build(), marsRover.move("b"));
    }

    @Test
    public void moves_forward_when_pointing_est(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("E").build();

        assertEquals(marsRoverBuilder().withCoordinates(3,2).withOrientation("E").build(), marsRover.move("f"));
    }

    @Test
    public void moves_backward_when_pointing_est(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("E").build();

        assertEquals(marsRoverBuilder().withCoordinates(1,2).withOrientation("E").build(), marsRover.move("b"));
    }

    @Test
    public void moves_forward_when_pointing_south(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("S").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,1).withOrientation("S").build(), marsRover.move("f"));
    }

    @Test
    public void moves_backward_when_pointing_south(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("S").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,3).withOrientation("S").build(), marsRover.move("b"));
    }

    @Test
    public void moves_forward_when_pointing_west(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("W").build();

        assertEquals(marsRoverBuilder().withCoordinates(1,2).withOrientation("W").build(), marsRover.move("f"));
    }

    @Test
    public void moves_backward_when_pointing_west(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("W").build();

        assertEquals(marsRoverBuilder().withCoordinates(3,2).withOrientation("W").build(), marsRover.move("b"));
    }
}
