import MarsRover.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {
    @Test
    public void obtain_same_marsRover_when_move_is_not_correct(){
        MarsRover marsRover = new MarsRover(2,2,'N');

        assertEquals(new MarsRover(2,2, 'N'), marsRover.move(""));
    }

    @Test
    public void obtain_same_marsRover_when_move_is_not_correct_(){
        MarsRover marsRover = new MarsRover(2,2,'N');

        assertEquals(new MarsRover(2,2, 'N'), marsRover.move("*"));
    }

    @Test
    public void moves_forward_when_pointing_north(){
        MarsRover marsRover = new MarsRover(2,2,'N');

        assertEquals(new MarsRover(2,3, 'N'), marsRover.move("f"));
    }

    @Test
    public void moves_backward_when_pointing_north(){
        MarsRover marsRover = new MarsRover(2,2,'N');

        assertEquals(new MarsRover(2,1, 'N'), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_north(){
        MarsRover marsRover = new MarsRover(2,2,'N');

        assertEquals(new MarsRover(2,2, 'O'), marsRover.move("l"));
    }

    @Test
    public void moves_right_when_pointing_north(){
        MarsRover marsRover = new MarsRover(2,2,'N');

        assertEquals(new MarsRover(2,2, 'E'), marsRover.move("r"));
    }

    @Test
    public void moves_forward_when_pointing_est(){
        MarsRover marsRover = new MarsRover(2,2,'E');

        assertEquals(new MarsRover(3,2, 'E'), marsRover.move("f"));
    }

    @Test
    public void moves_right_when_pointing_est(){
        MarsRover marsRover = new MarsRover(2,2,'E');

        assertEquals(new MarsRover(2,2, 'S'), marsRover.move("r"));
    }

    @Test
    public void moves_backward_when_pointing_est(){
        MarsRover marsRover = new MarsRover(2,2,'E');

        assertEquals(new MarsRover(1,2, 'E'), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_est(){
        MarsRover marsRover = new MarsRover(2,2,'E');

        assertEquals(new MarsRover(2,2, 'N'), marsRover.move("l"));
    }

    @Test
    public void moves_forward_when_pointing_south(){
        MarsRover marsRover = new MarsRover(2,2,'S');

        assertEquals(new MarsRover(2,1, 'S'), marsRover.move("f"));
    }

    @Test
    public void moves_right_when_pointing_south(){
        MarsRover marsRover = new MarsRover(2,2,'S');

        assertEquals(new MarsRover(2,2, 'O'), marsRover.move("r"));
    }

    @Test
    public void moves_backward_when_pointing_south(){
        MarsRover marsRover = new MarsRover(2,2,'S');

        assertEquals(new MarsRover(2,3, 'S'), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_south(){
        MarsRover marsRover = new MarsRover(2,2,'S');

        assertEquals(new MarsRover(2,2, 'E'), marsRover.move("l"));
    }

    @Test
    public void moves_forward_when_pointing_oest(){
        MarsRover marsRover = new MarsRover(2,2,'O');

        assertEquals(new MarsRover(1,2, 'O'), marsRover.move("f"));
    }

    @Test
    public void moves_right_when_pointing_oest(){
        MarsRover marsRover = new MarsRover(2,2,'O');

        assertEquals(new MarsRover(2,2, 'N'), marsRover.move("r"));
    }

    @Test
    public void moves_backward_when_pointing_oest(){
        MarsRover marsRover = new MarsRover(2,2,'O');

        assertEquals(new MarsRover(3,2, 'O'), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_oest(){
        MarsRover marsRover = new MarsRover(2,2,'O');

        assertEquals(new MarsRover(2,2, 'S'), marsRover.move("l"));
    }

    /*@Test
    public void receives_multiple_commands(){
        MarsRover marsRover = new MarsRover(2,2,'N');

        assertEquals(new MarsRover(2,4, 'N'), marsRover.move("ff"));
    }*/
}
