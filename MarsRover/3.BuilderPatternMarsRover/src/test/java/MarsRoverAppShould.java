import MarsRover.MarsRoverApp;
import org.junit.jupiter.api.Test;

import static MarsRover.BuilderPattern.MarsRoverBuilder.marsRoverBuilder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverAppShould {

    @Test
    public void obtain_same_marsRover_when_move_is_not_correct(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build(), marsRover.move(""));
    }

    @Test
    public void obtain_same_marsRover_when_move_is_not_correct_(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build(), marsRover.move("*"));
    }

    @Test
    public void receives_multiple_commands(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,4).withOrientation("N").build(), marsRover.move("ff"));
    }

    @Test
    public void receives_multiple_commands_(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,4).withOrientation("E").build(), marsRover.move("ffr"));
    }

}
