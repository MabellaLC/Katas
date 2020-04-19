import MarsRover.MarsRoverApp;
import org.junit.jupiter.api.Test;

import static MarsRover.BuilderPattern.MarsRoverBuilder.marsRoverBuilder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverAppShould {
/*
    @Test
    public void obtain_same_marsRover_when_move_is_not_correct(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"N");

        assertEquals(new MarsRoverApp(2,2, "N"), marsRover.move(""));
    }

    @Test
    public void obtain_same_marsRover_when_move_is_not_correct_(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"N");

        assertEquals(new MarsRoverApp(2,2, "N"), marsRover.move("*"));
    }*/

    @Test
    public void moves_forward_when_pointing_north(){
        MarsRoverApp marsRover = marsRoverBuilder().withCoordinates(2,2).withOrientation("N").build();

        assertEquals(marsRoverBuilder().withCoordinates(2,3).withOrientation("N").build(), marsRover.move("f"));
    }


   /* @Test
    public void moves_backward_when_pointing_north(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"N");

        assertEquals(new MarsRoverApp(2,1, "N"), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_north(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"N");

        assertEquals(new MarsRoverApp(2,2, "W"), marsRover.move("l"));
    }

    @Test
    public void moves_right_when_pointing_north(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"N");

        assertEquals(new MarsRoverApp(2,2, "E"), marsRover.move("r"));
    }

    @Test
    public void moves_forward_when_pointing_est(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"E");

        assertEquals(new MarsRoverApp(3,2, "E"), marsRover.move("f"));
    }

    @Test
    public void moves_right_when_pointing_est(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"E");

        assertEquals(new MarsRoverApp(2,2, "S"), marsRover.move("r"));
    }

    @Test
    public void moves_backward_when_pointing_est(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"E");

        assertEquals(new MarsRoverApp(1,2, "E"), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_est(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"E");

        assertEquals(new MarsRoverApp(2,2, "N"), marsRover.move("l"));
    }

    @Test
    public void moves_forward_when_pointing_south(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"S");

        assertEquals(new MarsRoverApp(2,1, "S"), marsRover.move("f"));
    }

    @Test
    public void moves_right_when_pointing_south(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"S");

        assertEquals(new MarsRoverApp(2,2, "W"), marsRover.move("r"));
    }

    @Test
    public void moves_backward_when_pointing_south(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"S");

        assertEquals(new MarsRoverApp(2,3, "S"), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_south(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"S");

        assertEquals(new MarsRoverApp(2,2, "E"), marsRover.move("l"));
    }

    @Test
    public void moves_forward_when_pointing_west(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"W");

        assertEquals(new MarsRoverApp(1,2, "W"), marsRover.move("f"));
    }

    @Test
    public void moves_right_when_pointing_west(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"W");

        assertEquals(new MarsRoverApp(2,2, "N"), marsRover.move("r"));
    }

    @Test
    public void moves_backward_when_pointing_west(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"W");

        assertEquals(new MarsRoverApp(3,2, "W"), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_west(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"W");

        assertEquals(new MarsRoverApp(2,2, "S"), marsRover.move("l"));
    }*/

/*

@Test
    public void receives_multiple_commands(){
        MarsRoverApp marsRover = new MarsRoverApp(2,2,"N");
        assertEquals(new MarsRoverApp(2,4, "N"), marsRover.move("ff"));
    }
*/


}
