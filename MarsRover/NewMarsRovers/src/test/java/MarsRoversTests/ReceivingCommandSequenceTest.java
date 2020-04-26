package MarsRoversTests;

import MarsRover.MarsRover;
import org.junit.jupiter.api.Test;

import static MarsRoversTests.MarsRoverHelpersTest.aRoverAt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceivingCommandSequenceTest {
    @Test
    public void not_moving_when_receiving_empty_command_sequence(){
        MarsRover marsRover = aRoverAt(1,3, "N");

        marsRover.receive("");

        assertEquals(aRoverAt(1,3, "N"), marsRover);
    }

    @Test
    public void receiving_a_sequence_with_multiple_commands(){
        MarsRover marsRover = aRoverAt(0,0,"S");

        marsRover.receive("lflbrf");

        assertEquals(aRoverAt(2,-1, "E"), marsRover);
    }
    @Test
    public void receiving_a_sequence_with_an_unknown_command(){
        MarsRover marsRover = aRoverAt(0, 4, "S");

        marsRover.receive("*");

        assertEquals(aRoverAt(0,4,"S"), marsRover);
    }

}
