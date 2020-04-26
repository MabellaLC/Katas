package MarsRoversTests;

import MarsRover.MarsRover;
import org.junit.jupiter.api.Test;

import static MarsRoversTests.MarsRoverBuilder.aRover;
import static MarsRoversTests.MarsRoverHelpersTest.aRoverAt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceivingCommandSequenceTest {
    @Test
    public void not_moving_when_receiving_empty_command_sequence(){
        MarsRover marsRover = aRover().at(1,3).facing("N").build();

        marsRover.receive("");

        assertEquals(aRoverAt(1,3, "N"), marsRover);
    }

    @Test
    public void receiving_a_sequence_with_multiple_commands(){
        MarsRover marsRover = aRover().at(0,0).facing("S").build();

        marsRover.receive("lflbrf");

        assertEquals(aRoverAt(2,-1, "E"), marsRover);
    }
    @Test
    public void receiving_a_sequence_with_an_unknown_command(){
        MarsRover marsRover = aRover().at(0,4).facing("S").build();

        marsRover.receive("*");

        assertEquals(aRoverAt(0,4,"S"), marsRover);
    }
}
